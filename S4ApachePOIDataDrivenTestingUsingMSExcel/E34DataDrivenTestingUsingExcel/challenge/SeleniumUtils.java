package S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge.ExcelUtils.*;

public class SeleniumUtils {
    static WebDriver driver;

    protected void startTest() {
        String fileLocation = "src/main/java/S4ApachePOIDataDrivenTestingUsingMSExcel/E34DataDrivenTestingUsingExcel/challenge/caldata.xlsx";
        String url = "https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/";
        String sheetLocation = "Sheet1";

        setXfile(fileLocation);
        setXlsheet(sheetLocation);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    protected void endTest(){
        driver.quit();
    }

    protected void setResult(){
        ArrayList<Map<String, String>> excelData = getExcelData();
        MapElements mE = new MapElements();
        for (Map<String, String> data : excelData) {
            mE.setValuesInElements(data);
            data.put("Result", mE.getResult());
        }
    }
}
