package com.germainsoftware.apm.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public WebDriver getDriver(BrowserSelector type) {
        WebDriver driver = null;
        switch (type) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", DriverManager.class.getClassLoader().getResource("geckodriver.exe").getPath());
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", DriverManager.class.getClassLoader().getResource("chromedriver.exe").getPath());
                driver = new ChromeDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", DriverManager.class.getClassLoader().getResource("IEDriverServer.exe").getPath());
                driver = new InternetExplorerDriver();
                break;
            case SAFARI:
                // TODO
                break;
        }
        return driver;
    }

}
