package com.germainsoftware.apm.testing.siebel;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageNavigationTest {
  private WebDriver driver;
  private boolean acceptNextAlert = true;

  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", PageNavigationTest.class.getClassLoader().getResource("chromedriver.exe").getPath());
    //driver = new ChromeDriver();
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
      for(int i =0; i<10;i++){
        driver = new ChromeDriver();
        driver.get("http://10.0.1.5/callcenter_enu/start.swe?SWECmd=Start&SWEHo=10.0.1.5");
        driver.findElement(By.id("s_swepi_1")).click();
        driver.findElement(By.id("s_swepi_1")).clear();
        driver.findElement(By.id("s_swepi_1")).sendKeys("SADMIN");
        driver.findElement(By.id("s_swepi_2")).clear();
        driver.findElement(By.id("s_swepi_2")).sendKeys("SADMIN");
        driver.findElement(By.id("s_swepi_22")).click();
        assertEquals("Your password will soon expire.  Please change your password from the User Profile page.", closeAlertAndGetItsText());
        DateTime dt = new DateTime();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Stage Execution")));
        driver.findElement(By.linkText("Stage Execution")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Charges")));
        driver.findElement(By.linkText("Charges")).click();
        WebElement el = driver.findElement(By.linkText("Opportunities"));
        Actions actions = new Actions(driver);
        actions.moveToElement(el).click().perform();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quotes")));
        WebElement el1 = driver.findElement(By.linkText("Explorer"));
        actions = new Actions(driver);
        actions.moveToElement(el1).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quotes")));
        el = driver.findElement(By.linkText("Quotes"));
        actions = new Actions(driver);
        actions.moveToElement(el).click().perform();
        Duration duration = new Duration(dt, DateTime.now());
        System.out.println(duration.getMillis());
        driver.close();
      }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
  
  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
  
}
