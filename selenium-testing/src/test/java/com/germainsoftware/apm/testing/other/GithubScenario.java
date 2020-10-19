package com.germainsoftware.apm.testing.other;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GithubScenario {

    private WebDriver driver;
    private final String HOSTNAME = "https://github.com/germainsoftware/public-ux";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
        
        Dimension el31 = new Dimension(2048,1010);
        driver.manage().window().setSize(el31);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long delay = 1500L;
        driver.get(HOSTNAME);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//MAIN[@id='js-repo-pjax-container']/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[4]/ul/li/a/span/span")));
        driver.findElement(By.xpath("//MAIN[@id='js-repo-pjax-container']/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[4]/ul/li/a/span/span")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("v8.6.9")));
        driver.findElement(By.linkText("v8.6.9")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Browse files")));
        driver.findElement(By.linkText("Browse files")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("+ 6 releases")));
        driver.findElement(By.linkText("+ 6 releases")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("germainsoftware")));
        driver.findElement(By.linkText("germainsoftware")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("public")));
        driver.findElement(By.linkText("public")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("README.md")));
        driver.findElement(By.linkText("README.md")).click();
        Thread.sleep(delay);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
