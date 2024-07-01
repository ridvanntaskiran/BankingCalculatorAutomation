package org.example.pages;


import org.example.base.BasePage;
import org.example.utils.LoanCalculatorLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class LoanCalculatorPage extends BasePage {
    WebDriver driver;

    public LoanCalculatorPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoanCalculatorPage elementCheck() {
        driver.findElement(By.xpath(LoanCalculatorLocators.CALCULATION_TOOLS_HEADER));
        driver.findElement(By.xpath(LoanCalculatorLocators.CALCULATE_LOAN_HEADER));
        driver.findElement(By.xpath(LoanCalculatorLocators.COMSUMER_LOAN_BUTTON));
        driver.findElement(By.xpath(LoanCalculatorLocators.VEHICLE_LOAN_BUTTON));
        driver.findElement(By.xpath(LoanCalculatorLocators.RESIDENTIAL_LOAN_BUTTON));

        return this;
    }
    public LoanCalculatorPage gotoConsumerLoan() {

        click(LoanCalculatorLocators.COMSUMER_LOAN_BUTTON);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_PAGE_HEADER);

        return this;
    }
    public LoanCalculatorPage calculateConsumerLoan() {

        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_PAGE_HEADER);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_SELECTION_HEADER);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_INFO_TEXT);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_INFO_TEXT2);

        click(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_SELECTION);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_DIGITAL_1);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_DIGITAL_2);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_1);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_2);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_3);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_4);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_PACKAGE_1);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_PACKAGE_2);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_PACKAGE_3);
        waitForElement(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_PACKAGE_4);

        click(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_CONSUMER_4);
        click(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_INPUT);
        clear(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_INPUT);
        sendKeys(LoanCalculatorLocators.COMSUMER_LOAN_AMOUNT_INPUT,"150000");

        click(LoanCalculatorLocators.COMSUMER_LOAN_MATURITY_COUNTS_INPUT);
        clear(LoanCalculatorLocators.COMSUMER_LOAN_MATURITY_COUNTS_INPUT);
        sendKeys(LoanCalculatorLocators.COMSUMER_LOAN_MATURITY_COUNTS_INPUT,"15");

        click(LoanCalculatorLocators.COMSUMER_LOAN_INTEREST_RATE_INPUT);
        clear(LoanCalculatorLocators.COMSUMER_LOAN_INTEREST_RATE_INPUT);
        sendKeys(LoanCalculatorLocators.COMSUMER_LOAN_INTEREST_RATE_INPUT,"5");

        click(LoanCalculatorLocators.CALCULATE_BUTTON);


        return this;
    }

    public void validateLoanCalculation() {
        waitForElement(LoanCalculatorLocators.OK_ICON);
        waitForElement(LoanCalculatorLocators.INSTALLMENT_AMOUNT);
        waitForElement(LoanCalculatorLocators.INTEREST_RATE);
        waitForElement(LoanCalculatorLocators.ANNUAL_COST_RATE);

    }
}
