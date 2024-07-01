package org.example.utils;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

public class IBANCalculatorLocators {
    public static final String IBAN_CALCULATION_HOME = "//a[normalize-space()='IBAN Hesaplama']";
    public static final String IBAN_CALCULATION_HEADER = "//h1[normalize-space()='IBAN Hesaplama']";
    public static final String IBAN_CALCULATION_INFO_TEXT = "//p[@class='lead']";
    public static final String CODE_RADIO_BUTTON = "//label[@for='radio-1']";
    public static final String NAME_RADIO_BUTTON = "//label[@for='radio-2']";
    public static final String BRANCH_OFFICE_SELECTION = "//div[@class='select-box']";
    public static final String CUSTOMER_NUMBER_INPUT = "//input[@id='musteriNo']";
    public static final String SECONDARY_NUMBER_INPUT = "//input[@id='ekNo']";
    public static final String RESULT_IBAN_LABEL = "//label[normalize-space()='IBAN']";



}
