package org.example.utils;

public class DepositLoanCalculatorLocators {
    //div[@class='col-xs-12 mB30']//a[normalize-space()='Mevduat Getirisi Hesaplama']

    public static final String DEPOSIT_LOAN_CALCULATION_HOME = "//a[normalize-space()='Mevduat Getirisi Hesaplama']";
    public static final String DEPOSIT_LOAN_CALCULATION_HEADER = "//h1[normalize-space()='Mevduat Getirisi Hesaplama']";
    public static final String DEPOSIT_LOAN_CALCULATION_INFO_TEXT = "//p[@class='lead']";
    public static final String CURRENCY_TYPE = "//div[@class='select-box']";
    public static final String TRY_SELECTION = "//option[@value='TRY']";
    public static final String USD_SELECTION = "//option[@value='USD']";
    public static final String EUR_SELECTION = "//option[@value='EUR']";

    public static final String MATURITY_DAY_AMOUNT_INPUT = "//input[@id='deposit-calc-vade']";
    public static final String CURRENCY_AMOUNT_INPUT = "//input[@id='tutar']";
    public static final String AMOUNT_AFTER_INSTALLMENT_TEXT = "//label[contains(text(),'Vade Sonu Tutarı')]";
    public static final String INTEREST_RATE_TEXT = "//label[contains(text(),'Faiz Oranı')]";







}
