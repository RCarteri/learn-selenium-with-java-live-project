package S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge;

import java.io.IOException;

public class DataDrivenTest {
    public static void main(String[] args) throws IOException {
        SeleniumUtils sU = new SeleniumUtils();
        ExcelUtils eU = new ExcelUtils();

        sU.startTest();
        eU.setExcelData();
        sU.setResult();
        eU.writeResult();
        sU.endTest();
    }
}
