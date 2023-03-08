package S4ApachePOIDataDrivenTestingUsingMSExcel.E33ReadingExcelAndWritingDataIntoExcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {
    //    File -> Workbook -> Sheets -> Row -> Cell
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/S4ApachePOIDataDrivenTestingUsingMSExcel/E33ReadingExcelAndWritingDataIntoExcel/data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum();
        short totalCells = sheet.getRow(1).getLastCellNum();

        System.out.println("Total rows: " + totalRows);
        System.out.println("Total cells: " + totalCells);

        for (int r = 0; r <= totalRows; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c < totalCells; c++) {
                System.out.print(currentRow.getCell(c).toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
