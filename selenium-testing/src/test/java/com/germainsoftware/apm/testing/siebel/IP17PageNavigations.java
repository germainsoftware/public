package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP17PageNavigations {

    private WebDriver driver;
    private final String HOSTNAME = "YOUR_HOSTNAME";
    private final String USERNAME = "YOUR_USERNAME";
    private final String PASSWORD = "YOUR_PASSWORD";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.FIREFOX);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        for (int i = 0; i < 10; i++) {

            LocalDateTime start = LocalDateTime.now();

            driver.get(HOSTNAME + "/siebel/app/callcenter/enu?SWECmd=Logoff&SWETS=1554113766788&SWEPreLd=1");
            driver.findElement(By.id("s_swepi_1")).click();
            driver.findElement(By.id("s_swepi_1")).clear();
            driver.findElement(By.id("s_swepi_1")).sendKeys(USERNAME);
            driver.findElement(By.id("s_swepi_2")).clear();
            driver.findElement(By.id("s_swepi_2")).sendKeys(PASSWORD);
            driver.findElement(By.name("SWEEntryForm")).submit();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("s_5_1_27_0_mb")));
            System.out.println("Login," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();

            // START ACCOUNTS
            openMenu(wait, driver);
            //wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounts")));
            //driver.findElement(By.linkText("Accounts")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-104")));
            driver.findElement(By.id("ui-id-104")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='s_6_2_20_0_mb']")));
            System.out.println("Accounts," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END ACCOUNTS

            // START MY ACCOUNTS
            driver.findElement(By.xpath("//*[@id='s_6_2_20_0_mb']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("s_vis_div")));
            System.out.println("My Accounts," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END MY ACCOUNTS

            // START CONTACTS
            openMenu(wait, driver);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contacts")));
            driver.findElement(By.linkText("Contacts")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='s_6_2_20_0_mb']")));
            System.out.println("Contacts," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END CONTACTS

            // START MY CONTACTS
            driver.findElement(By.xpath("//*[@id='s_6_2_20_0_mb']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("s_vis_div")));
            System.out.println("My Contacts," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END MY CONTACTS

            // START OPPS
            openMenu(wait, driver);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Opportunities")));
            driver.findElement(By.linkText("Opportunities")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='s_6_2_20_0_mb']")));
            System.out.println("Opportunities," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END OPPS

            // START MY OPPS
            driver.findElement(By.xpath("//*[@id='s_6_2_20_0_mb']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("s_vis_div")));
            System.out.println("My Opportunities," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END MY OPPS

            // START SVC
            openMenu(wait, driver);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Service")));
            driver.findElement(By.linkText("Service")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='s_5_2_20_0_mb']")));
            System.out.println("Service," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            start = LocalDateTime.now();
            // END SVC

            // START MY SVC
            driver.findElement(By.xpath("//*[@id='s_5_2_20_0_mb']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("s_vis_div")));
            System.out.println("My Service," + (double) (ChronoUnit.MILLIS.between(start, LocalDateTime.now())) / 1000.0);
            // END MY SVC
        }

    }

    private void openMenu(WebDriverWait wait, WebDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".siebui-nav-hb-btn.siebui-display")));
        driver.findElement(By.cssSelector(".siebui-nav-hb-btn.siebui-display")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
