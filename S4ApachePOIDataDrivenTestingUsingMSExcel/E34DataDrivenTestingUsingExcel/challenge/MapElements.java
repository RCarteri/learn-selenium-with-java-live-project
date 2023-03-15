package S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static S4ApachePOIDataDrivenTestingUsingMSExcel.E34DataDrivenTestingUsingExcel.challenge.SeleniumUtils.*;

public class MapElements {
    private static final WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

    protected void setValuesInElements(Map<String, String> data) {
        clearFields();
        getInitalDepositAmount().sendKeys(data.get("Initial Deposit amout"));
        getInterestRate().sendKeys(data.get("Interest rate"));
        getLenghtMonths().sendKeys(data.get("Length (months)"));
        getCompoundedingOption(data.get("Compounding"));
        getButtonLetsRun().click();
    }

    private void clearFields() {
        getInitalDepositAmount().clear();
        getLenghtMonths().clear();
        getInterestRate().clear();
    }

    private void getCompoundedingOption(String compounding) {
        if (getCompounding().equals(compounding)) return;

        WebElement compoundeding = getElement("#mat-select-0");
        compoundeding.click();

        List<WebElement> options = mywait.until(ExpectedConditions.visibilityOfAllElements(
                getOptions()));

        options.stream()
                .filter(option -> option.getText().equals(compounding))
                .forEach(WebElement::click);

        mywait.until(ExpectedConditions.invisibilityOfAllElements(
                getOptions()));
    }

    private WebElement getInitalDepositAmount() {
        return getElement("#mat-input-0");
    }

    private WebElement getLenghtMonths() {
        return getElement("#mat-input-1");
    }

    private WebElement getInterestRate() {
        return getElement("#mat-input-2");
    }

    private String getCompounding() {
        return getElement("span span.ng-tns-c109-4").getText();
    }

    private WebElement getButtonLetsRun() {
        return getElement("#CIT-chart-submit");
    }

    protected String getResult() {
        return getElement("#displayTotalValue").getText();
    }

    private WebElement getElement(String locator) {
        return driver.findElement(By.cssSelector(locator));
    }

    private List<WebElement> getOptions() {
        return driver.findElements(By.cssSelector("span.mat-option-text"));
    }
}
