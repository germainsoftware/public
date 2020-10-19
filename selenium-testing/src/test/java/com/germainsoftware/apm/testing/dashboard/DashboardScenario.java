package com.germainsoftware.apm.testing.dashboard;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardScenario {

    private WebDriver driver;
    private final String HOSTNAME = "DASHBOARD_URL";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long delay = 1000L;
        driver.get(HOSTNAME);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("USER");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).sendKeys("PASS");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//FORM[@id='login']/div[3]/div/input")));
        driver.findElement(By.xpath("//FORM[@id='login']/div[3]/div/input")).click();
        Thread.sleep(delay);

        Dimension el42 = new Dimension(2048,660);
        driver.manage().window().setSize(el42);

        Dimension el43 = new Dimension(2048,1010);
        driver.manage().window().setSize(el43);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/div[3]/div/div[1]/div/button/span[1]/i")));
        driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div/button/span[1]/i")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/a[3]/span/span")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/a[3]/span/span")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("jss125")));
        driver.findElement(By.className("jss125")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/button[8]/span[1]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/button[8]/span[1]")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/a[2]/div/div/div[2]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/a[2]/div/div/div[2]")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/a[12]/div/div/div[8]/span")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/a[12]/div/div/div[8]/span")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("System")));
        driver.findElement(By.linkText("System")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[9]/div/a[1]/span/span[2]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[9]/div/a[1]/span/span[2]")).click();
        Thread.sleep(delay);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/a[6]/div/div/div[3]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/a[6]/div/div/div[3]")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button/span[1]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button/span[1]")).click();
        Thread.sleep(delay);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[4]/div[2]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[4]/div[2]")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/a[4]/span")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/a[4]/span")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[4]/div/a[5]/span")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[4]/div/a[5]/span")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[1]/div[3]/div[2]/span[1]/i")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[1]/div[3]/div[2]/span[1]/i")).click();
        Thread.sleep(delay);

    }
    
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
