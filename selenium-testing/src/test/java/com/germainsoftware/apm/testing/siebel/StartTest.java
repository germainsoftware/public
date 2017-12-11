package com.germainsoftware.apm.testing.siebel;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Seconds;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartTest {
  private WebDriver driver;
  private boolean acceptNextAlert = true;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", StartTest.class.getClassLoader().getResource("chromedriver.exe").getPath());
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    DateTime dt = new DateTime();
    driver.get("http://10.0.1.5/callcenter_enu/start.swe?SWECmd=Start&SWEHo=10.0.1.5");
    driver.findElement(By.id("s_swepi_1")).click();
    driver.findElement(By.id("s_swepi_1")).clear();
    driver.findElement(By.id("s_swepi_1")).sendKeys("SADMIN");
    driver.findElement(By.id("s_swepi_2")).clear();
    driver.findElement(By.id("s_swepi_2")).sendKeys("SADMIN");
    driver.findElement(By.id("s_swepi_22")).click();
    assertEquals("Your password will soon expire.  Please change your password from the User Profile page.", closeAlertAndGetItsText());
    //WebDriverWait wait = new WebDriverWait(driver, 30);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-116")));
    driver.findElement(By.id("ui-id-130")).click();
    driver.findElement(By.id("s_6_2_19_0_mb")).click();
    driver.findElement(By.linkText("Colorado Motorcycle Adventures")).click();
    driver.findElement(By.id("ui-id-186")).click();
    driver.findElement(By.id("s_6_2_19_0_mb")).click();
    driver.findElement(By.id("ui-id-273")).click();
    Duration duration = new Duration(dt, DateTime.now());
    System.out.println(duration.getMillis());
    driver.close();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
  
  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
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
