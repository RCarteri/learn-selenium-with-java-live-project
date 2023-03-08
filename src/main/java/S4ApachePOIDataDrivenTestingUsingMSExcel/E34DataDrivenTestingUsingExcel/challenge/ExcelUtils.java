package S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.apache.poi.ss.usermodel.IndexedColors.*;
import static org.apache.poi.ss.usermodel.IndexedColors.GREEN;

public class ExcelUtils {
    private static FileInputStream fi;
    private static FileOutputStream fo;
    private static XSSFWorkbook wb;
    private static XSSFSheet ws;
    private static XSSFRow row;
    private static XSSFCell cell;
    private static String xlfile;
    private static String xlsheet;
    private static final ArrayList<Map<String, String>> excelData = new ArrayList<>();

    protected static ArrayList<Map<String, String>> getExcelData() {
        return excelData;
    }

    protected static void setXfile(String xlfile) {
        ExcelUtils.xlfile = xlfile;
    }

    protected static void setXlsheet(String xlsheet) {
        ExcelUtils.xlsheet = xlsheet;
    }

    protected void setExcelData() throws IOException {
        openSheet();
        for (int r = 1; r <= getRowCount(); r++) {
            HashMap<String, String> hM = new HashMap<>();
            for (int c = 0; c < getCellCount(r); c++) {
                String key = getCellData(0, c);
                String value = getCellData(r, c);
                hM.put(key, value);
            }
            excelData.add(hM);
        }
        closeSheet();
    }

    private static void closeSheet() throws IOException {
        wb.close();
        fi.close();
    }

    private static void openSheet() throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
    }

    protected void writeResult() throws IOException {
        openSheet();
        for (int row = 0; row < excelData.size(); row++) {
            setCellData(row + 1, excelData.get(row).get("Result"));
            setColor(row);
        }
        closeSheet();
    }

    private static void setColor(int row) throws IOException {
        String expected = excelData.get(row).get("Total");
        String result = excelData.get(row).get("Result");
        if (result.equals(expected))
            fillColor(row, GREEN);
        else
            fillColor(row, RED);
    }

    private static int getRowCount() {
        return ws.getLastRowNum();
    }

    private static int getCellCount(int rownum) {
        return ws.getRow(rownum).getLastCellNum();
    }

    private static String getCellData(int rownum, int colnum) {
        row = ws.getRow(rownum);
        cell = row.getCell(colnum);

        String data;
        try {
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
            return data;
        } catch (Exception e) {
            data = "";
        }
        return data;
    }

    private static void setCellData(int rownum, String data) throws IOException {
        fo = new FileOutputStream(xlfile);
        row = ws.getRow(rownum);
        cell = row.createCell(6);
        cell.setCellValue(data);
        wb.write(fo);
        fo.close();
    }

    private static void fillColor(int rownum, IndexedColors color) throws IOException {
        fo = new FileOutputStream(xlfile);
        row = ws.getRow(rownum + 1);
        cell = row.getCell(6);

        CellStyle style = wb.createCellStyle();

        style.setFillForegroundColor(color.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        wb.write(fo);
        fo.close();
    }
}
