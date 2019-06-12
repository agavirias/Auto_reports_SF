package com.mycompany.mavenproject2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.sun.net.httpserver.Authenticator;
import java.util.concurrent.TimeUnit;

public class SuccessFactor {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public SuccessFactor() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RENT-COM\\Desktop\\Alejandro\\Librerias Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public boolean testSFSF(String a, String b, String c) {
        try {
            driver.get("https://hcm19preview.sapsf.com/sf/start/#/companyEntry");
            driver.findElement(By.id("__input0-inner")).sendKeys(a);
            driver.findElement(By.id("__button0-img")).click();
            driver.findElement(By.xpath("//*[@id=\"__input1-inner\"]")).sendKeys(b);
            driver.findElement(By.xpath("//*[@id=\"__input2-inner\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"__input2-inner\"]")).sendKeys(c);
            driver.findElement(By.xpath("//*[@id=\"__button2-content\"]")).click();
            
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(new SuccessFactor().testSFSF(args[0], args[1], args[2])); 
    }
}
