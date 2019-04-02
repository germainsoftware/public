package com.germainsoftware.apm.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    public WebDriver getDriver(BrowserSelector type) {
        WebDriver driver = null;
        switch (type) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", DriverManager.class.getClassLoader().getResource("windows/geckodriver.exe").getPath());
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", DriverManager.class.getClassLoader().getResource("windows/chromedriver.exe").getPath());
                driver = new ChromeDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", DriverManager.class.getClassLoader().getResource("windows/IEDriverServer.exe").getPath());
                driver = new InternetExplorerDriver();
                break;
            case SAFARI:
                System.setProperty("webdriver.safari.driver", DriverManager.class.getClassLoader().getResource("mac/safaridriver").getPath());
                driver = new SafariDriver();
                break;
        }
        return driver;
    }

}
