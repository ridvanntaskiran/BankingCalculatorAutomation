package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.base.WebDriverSetup;
import org.example.pages.LoanCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.example.base.WebDriverSetup.getDriver;

public class LoanCalculatorTest {
    WebDriver driver;
    LoanCalculatorPage loanCalculatorPage;

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = getDriver();
        loanCalculatorPage = new LoanCalculatorPage(driver);
    }

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.ziraatbank.com.tr/tr/hesaplama-araclari");
        driver.manage().window().maximize();
    }

    @Test
    public void tests() throws InterruptedException {
        loanCalculatorPage
                .elementCheck()
                .gotoConsumerLoan()
                .calculateConsumerLoan()
                .validateLoanCalculation();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}
