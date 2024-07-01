package org.example.pages;

import org.example.base.BasePage;
import org.example.utils.IBANCalculatorLocators;
import org.example.utils.LoanCalculatorLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IBANCalculatorPage extends BasePage {

    WebDriver driver;

    public IBANCalculatorPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public IBANCalculatorPage elementCheck() {

        click(IBANCalculatorLocators.IBAN_CALCULATION_HOME);
        waitForElement(IBANCalculatorLocators.IBAN_CALCULATION_HEADER);
        waitForElement(IBANCalculatorLocators.IBAN_CALCULATION_INFO_TEXT);
        waitForElement(IBANCalculatorLocators.CODE_RADIO_BUTTON);
        waitForElement(IBANCalculatorLocators.NAME_RADIO_BUTTON);
        waitForElement(IBANCalculatorLocators.BRANCH_OFFICE_SELECTION);
        waitForElement(IBANCalculatorLocators.CUSTOMER_NUMBER_INPUT);
        waitForElement(IBANCalculatorLocators.SECONDARY_NUMBER_INPUT);

        return this;
    }
    public IBANCalculatorPage calculateIBAN() {

        click(IBANCalculatorLocators.CUSTOMER_NUMBER_INPUT);
        sendKeys(IBANCalculatorLocators.CUSTOMER_NUMBER_INPUT,"10000000");
        click(IBANCalculatorLocators.SECONDARY_NUMBER_INPUT);
        sendKeys(IBANCalculatorLocators.SECONDARY_NUMBER_INPUT,"1000");
        click(LoanCalculatorLocators.CALCULATE_BUTTON);

        return this;
    }
    public void validateIBANCalculation()  {

        waitForElement(LoanCalculatorLocators.OK_ICON);
        waitForElement(IBANCalculatorLocators.RESULT_IBAN_LABEL);

    }

}
