package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP13ClickScenario1 {

    private WebDriver driver;
    private final String HOSTNAME = "http://10.0.1.5/callcenter_enu/";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.FIREFOX);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {

        driver.get(HOSTNAME);
        WebDriverWait wait = new WebDriverWait(driver, 30000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
                driver.findElement(By.id("s_swepi_1")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[2]/span/input")));
                driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[2]/span/input")).click();
            }
        } catch (Exception e) {
            WebElement el0 = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[2]/span/input"));
            js.executeScript("arguments[0].click();", el0);
        }
        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
            driver.findElement(By.id("s_swepi_1")).sendKeys("SADMIN");
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[2]/span/input")));
            driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[2]/span/input")).sendKeys("SADMIN");
        }
        Thread.sleep(1000);

        String keys2 = Keys.chord(Keys.TAB);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
            driver.findElement(By.id("s_swepi_2")).sendKeys(keys2);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")));
            driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")).sendKeys(keys2);
        }
        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
            driver.findElement(By.id("s_swepi_2")).sendKeys("SADMIN");
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")));
            driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")).sendKeys("SADMIN");
        }
        Thread.sleep(1000);

        String keys4 = Keys.chord(Keys.ENTER);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
            driver.findElement(By.id("s_swepi_2")).sendKeys(keys4);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")));
            driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]/p[3]/span/input")).sendKeys(keys4);
        }
        Thread.sleep(1000);

        Dimension dim5 = new Dimension(1920, 937);
        driver.manage().window().setSize(dim5);
        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/div[1]/div[2]/div/div/form/div/div/div/div[3]/div[3]/div/table/tbody/tr[4]/td[3]/a")));
            driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/div[1]/div[2]/div/div/form/div/div/div/div[3]/div[3]/div/table/tbody/tr[4]/td[3]/a")).click();
        } catch (Exception e) {
            WebElement el6 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/div[1]/div[2]/div/div/form/div/div/div/div[3]/div[3]/div/table/tbody/tr[4]/td[3]/a"));
            js.executeScript("arguments[0].click();", el6);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-165")));
                driver.findElement(By.id("ui-id-165")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[12]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[12]/a")).click();
            }
        } catch (Exception e) {
            WebElement el7 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[12]/a"));
            js.executeScript("arguments[0].click();", el7);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-181")));
                driver.findElement(By.id("ui-id-181")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[5]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
            }
        } catch (Exception e) {
            WebElement el8 = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[5]/a"));
            js.executeScript("arguments[0].click();", el8);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_6_2_19_0_mb")));
                driver.findElement(By.id("s_6_2_19_0_mb")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[1]/td/div[1]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[1]/td/div[1]/a")).click();
            }
        } catch (Exception e) {
            WebElement el9 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[1]/td/div[1]/a"));
            js.executeScript("arguments[0].click();", el9);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test")));
                driver.findElement(By.linkText("Test")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[3]/td[2]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[3]/td[2]/a")).click();
            }
        } catch (Exception e) {
            WebElement el10 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[3]/td[2]/a"));
            js.executeScript("arguments[0].click();", el10);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-300")));
                driver.findElement(By.id("ui-id-300")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[14]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[14]/a")).click();
            }
        } catch (Exception e) {
            WebElement el11 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[14]/a"));
            js.executeScript("arguments[0].click();", el11);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-343")));
                driver.findElement(By.id("ui-id-343")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[3]/ul/li[4]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[3]/ul/li[4]/a")).click();
            }
        } catch (Exception e) {
            WebElement el12 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[3]/ul/li[4]/a"));
            js.executeScript("arguments[0].click();", el12);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("S_A1_tgs")));
                driver.findElement(By.name("S_A1_tgs")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")).click();
            }
        } catch (Exception e) {
            WebElement el13 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select"));
            js.executeScript("arguments[0].click();", el13);
        }
        Thread.sleep(1000);

        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("S_A1_tgs")));
            Select el10 = new Select(driver.findElement(By.name("S_A1_tgs")));
            el10.selectByValue("1");
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")));
            Select elXPath10 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")));
            elXPath10.selectByValue("1");
        }
        Thread.sleep(1000);
//
//        try {
//            try {
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("S_A1_tgs")));
//                driver.findElement(By.name("S_A1_tgs")).click();
//            } catch (Exception e) {
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")));
//                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select")).click();
//            }
//        } catch (Exception e) {
//            WebElement el15 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[3]/div[1]/div/table/tbody/tr/td/span/div/table/tbody/tr/td/table[1]/tbody/tr/td[1]/table/tbody/tr/td[3]/select"));
//            js.executeScript("arguments[0].click();", el15);
//        }
//        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-403")));
                driver.findElement(By.id("ui-id-403")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[9]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[9]/a")).click();
            }
        } catch (Exception e) {
            WebElement el16 = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[9]/a"));
            js.executeScript("arguments[0].click();", el16);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("All Sales Orders")));
                driver.findElement(By.linkText("All Sales Orders")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[2]/td/div[1]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[2]/td/div[1]/a")).click();
            }
        } catch (Exception e) {
            WebElement el17 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div/table/tbody/tr/td[1]/div[1]/div/div/div/form/div/table/tbody/tr[2]/td/div[1]/a"));
            js.executeScript("arguments[0].click();", el17);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
                driver.findElement(By.name("s_pdq")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")).click();
            }
        } catch (Exception e) {
            WebElement el18 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select"));
            js.executeScript("arguments[0].click();", el18);
        }
        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
            driver.findElement(By.name("s_pdq")).sendKeys("Open Sales Orders");
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")));
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")).sendKeys("Open Sales Orders");
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("s_pdq")));
                driver.findElement(By.name("s_pdq")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select")).click();
            }
        } catch (Exception e) {
            WebElement el20 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/form/div/div[2]/select"));
            js.executeScript("arguments[0].click();", el20);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("6Order_Number")));
                driver.findElement(By.id("6Order_Number")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[7]/td[2]")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[7]/td[2]")).click();
            }
        } catch (Exception e) {
            WebElement el21 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[7]/td[2]"));
            js.executeScript("arguments[0].click();", el21);
        }
        Thread.sleep(1000);

        try {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("1-2660497")));
                driver.findElement(By.linkText("1-2660497")).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[8]/td[2]/a")));
                driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[8]/td[2]/a")).click();
            }
        } catch (Exception e) {
            WebElement el22 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[1]/div/div/form/span/div/div[2]/div/div/div[3]/div[3]/div/table/tbody/tr[8]/td[2]/a"));
            js.executeScript("arguments[0].click();", el22);
        }
        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul")));
            driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul")).click();
        } catch (Exception e) {
            WebElement el23 = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul"));
            js.executeScript("arguments[0].click();", el23);
        }
        Thread.sleep(1000);

        String keys24 = Keys.chord(Keys.CONTROL, Keys.SHIFT, "x");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body")));
        driver.findElement(By.xpath("/html/body")).sendKeys(keys24);
        Thread.sleep(1000);

        Dimension dim25 = new Dimension(1920, 937);
        driver.manage().window().setSize(dim25);
        Thread.sleep(1000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
