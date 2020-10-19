package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP13ClickScenario {

    private WebDriver driver;
    private final String HOSTNAME = "http://10.0.1.5/callcenter_enu/";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.FIREFOX);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        long delay = 1000L;
        driver.get(HOSTNAME);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scenario: login > monitoringCOnfig > KPI > User Click > User Click SLA
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
        driver.findElement(By.id("s_swepi_1")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
        driver.findElement(By.id("s_swepi_1")).sendKeys("SADMIN");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
        driver.findElement(By.id("s_swepi_2")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
        driver.findElement(By.id("s_swepi_2")).sendKeys("SADMIN");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_22")));
        driver.findElement(By.id("s_swepi_22")).click();
        Thread.sleep(delay);
        
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Accounts")));
            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Accounts")));
            driver.findElement(By.partialLinkText("Accounts")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Accounts")));
            driver.findElement(By.partialLinkText("Accounts")).click();
            System.out.println("Clicked2");
        }
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_4_1_16_0")));
            driver.findElement(By.name("s_4_1_16_0")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='s_S_A4_div']/div/form/div/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")));
            driver.findElement(By.xpath("//DIV[@id='s_S_A4_div']/div/form/div/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")).click();
        }
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("All Accounts")));
            driver.findElement(By.linkText("All Accounts")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("null")));
            driver.findElement(By.xpath("null")).click();
        }
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("NewAcc")));
            driver.findElement(By.linkText("NewAcc")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TD[@id='7Name']/a")));
            driver.findElement(By.xpath("//TD[@id='7Name']/a")).click();
        }
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
            driver.findElement(By.name("s_pdq")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='PDQToolbar']/div[2]/select")));
            driver.findElement(By.xpath("//DIV[@id='PDQToolbar']/div[2]/select")).click();
        }
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
        driver.findElement(By.name("s_pdq")).sendKeys("All Fraud Accounts");
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
            driver.findElement(By.name("s_pdq")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='PDQToolbar']/div[2]/select")));
            driver.findElement(By.xpath("//DIV[@id='PDQToolbar']/div[2]/select")).click();
        }
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@id='ui-id-182']/img")));
        driver.findElement(By.xpath("//A[@id='ui-id-182']/img")).click();
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("1-3125830")));
            driver.findElement(By.linkText("1-3125830")).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@id='s_2_2_18_0_mb']")));
            driver.findElement(By.xpath("//A[@id='s_2_2_18_0_mb']")).click();
        }
        Thread.sleep(delay);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
