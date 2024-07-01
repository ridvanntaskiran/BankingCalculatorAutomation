package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.base.WebDriverSetup;
import org.example.pages.DepositLoanCalculatorPage;
import org.example.pages.LoanCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.example.base.WebDriverSetup.getDriver;

public class DepositLoanCalculatorTest {

    WebDriver driver;
    LoanCalculatorPage loanCalculatorPage;
    DepositLoanCalculatorPage depositloanCalculatorPage;

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = getDriver();
        depositloanCalculatorPage = new DepositLoanCalculatorPage(driver);
        loanCalculatorPage = new LoanCalculatorPage(driver);
    }

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.ziraatbank.com.tr/tr/hesaplama-araclari");
        driver.manage().window().maximize();
    }

    @Test
    public void tests() {
        loanCalculatorPage.
                elementCheck();
        depositloanCalculatorPage
                .elementCheck()
                .calculateDepositLoan()
                .validateDepositCalculation();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

