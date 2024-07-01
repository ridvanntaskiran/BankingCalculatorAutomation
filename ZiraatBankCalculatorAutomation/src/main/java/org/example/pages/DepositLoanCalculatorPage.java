package org.example.pages;

import org.example.base.BasePage;
import org.example.utils.DepositLoanCalculatorLocators;
import org.example.utils.LoanCalculatorLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DepositLoanCalculatorPage extends BasePage {

    WebDriver driver;

    public DepositLoanCalculatorPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DepositLoanCalculatorPage elementCheck() {

        click(DepositLoanCalculatorLocators.DEPOSIT_LOAN_CALCULATION_HOME);
        waitForElement(DepositLoanCalculatorLocators.DEPOSIT_LOAN_CALCULATION_HEADER);
        waitForElement(DepositLoanCalculatorLocators.DEPOSIT_LOAN_CALCULATION_INFO_TEXT);
        waitForElement(DepositLoanCalculatorLocators.CURRENCY_TYPE);
        click(DepositLoanCalculatorLocators.CURRENCY_TYPE);
        waitForElement(DepositLoanCalculatorLocators.TRY_SELECTION);
        waitForElement(DepositLoanCalculatorLocators.USD_SELECTION);
        waitForElement(DepositLoanCalculatorLocators.EUR_SELECTION);
        click(DepositLoanCalculatorLocators.EUR_SELECTION);
        waitForElement(DepositLoanCalculatorLocators.MATURITY_DAY_AMOUNT_INPUT);
        waitForElement(DepositLoanCalculatorLocators.CURRENCY_AMOUNT_INPUT);

        return this;
    }

    public DepositLoanCalculatorPage calculateDepositLoan() {

        click(DepositLoanCalculatorLocators.CURRENCY_TYPE);
        waitForElement(DepositLoanCalculatorLocators.TRY_SELECTION);
        click(DepositLoanCalculatorLocators.TRY_SELECTION);
        click(DepositLoanCalculatorLocators.MATURITY_DAY_AMOUNT_INPUT);
        clear(DepositLoanCalculatorLocators.MATURITY_DAY_AMOUNT_INPUT);
        sendKeys(DepositLoanCalculatorLocators.MATURITY_DAY_AMOUNT_INPUT,"10");
        click(DepositLoanCalculatorLocators.CURRENCY_AMOUNT_INPUT);
        clear(DepositLoanCalculatorLocators.CURRENCY_AMOUNT_INPUT);
        sendKeys(DepositLoanCalculatorLocators.CURRENCY_AMOUNT_INPUT,"10000");
        click(LoanCalculatorLocators.CALCULATE_BUTTON);

        return this;
    }

    public void validateDepositCalculation() {

        waitForElement(DepositLoanCalculatorLocators.AMOUNT_AFTER_INSTALLMENT_TEXT);
        waitForElement(DepositLoanCalculatorLocators.INTEREST_RATE_TEXT);

    }
}
