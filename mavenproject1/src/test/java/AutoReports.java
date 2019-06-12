import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoReports {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RENT-COM\\Desktop\\Alejandro\\Librerias Selenium\\ChromeDriver\\chromedriver.exe"); 
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAutoReports() throws Exception {
    driver.get("https://hcm19preview.sapsf.com/sf/start/#/companyEntry");
    driver.findElement(By.id("__input0-inner")).click();
    driver.findElement(By.id("__input0-inner")).clear();
    driver.findElement(By.id("__input0-inner")).sendKeys("almaceneseT1");
    driver.findElement(By.id("__button0-img")).click();
    driver.findElement(By.id("__input1-inner")).click();
    driver.findElement(By.id("__input1-inner")).clear();
    driver.findElement(By.id("__input1-inner")).sendKeys("38000280");
    driver.findElement(By.id("__icon2")).click();
    driver.findElement(By.id("__input2-inner")).click();
    driver.findElement(By.id("__input2-inner")).click();
    driver.findElement(By.id("__input2-inner")).clear();
    driver.findElement(By.id("__input2-inner")).sendKeys("Colombia+2018");
    driver.findElement(By.id("__button2-BDI-content")).click();
    driver.findElement(By.id("bizXSearchField-I")).click();
    driver.findElement(By.id("customHeaderModulePickerBtn-img")).click();
    driver.findElement(By.id("__item7-__list3-7")).click();
    driver.findElement(By.id("bizxSubTab_ONBOARDING_DASHBOARD_PAGE")).click();
    driver.findElement(By.id("onbMenuItem2-txt")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.linkText("Informes avanzados")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Informes'])[2]/following::td[3]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.id("btnCreate_btnCreate")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxReportName")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxReportName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxReportName")).sendKeys("reporte PRESENTE");
    driver.findElement(By.id("dialogContentHolder")).click();
    driver.findElement(By.id("ctl00_ButtonsPlaceHolder_ButtonNext")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ButtonNewFieldSelect")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListTag")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListTag"))).selectByVisibleText("GE_FondoPresente");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListTag")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descripción'])[1]/following::td[1]")).click();
    driver.findElement(By.id("ctl00_ButtonsPlaceHolder_ButtonSelect")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ButtonNewFieldAdd")).click();
    driver.findElement(By.id("ctl00_ButtonsPlaceHolder_ButtonNext")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListProcess")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListProcess"))).selectByVisibleText("Incorporación de Personal");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListProcess")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListStartDateType")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_DropDownListStartDateType")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Desde:'])[1]/following::img[1]")).click();
    driver.findElement(By.linkText("1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hasta:'])[1]/following::img[1]")).click();
    driver.findElement(By.linkText("31")).click();
    driver.findElement(By.id("ctl00_ButtonsPlaceHolder_ButtonNext")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxTemplateName")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxTemplateName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_TextBoxTemplateName")).sendKeys("PRESENTE");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ButtonSaveTemplate")).click();
    driver.findElement(By.id("ctl00_ButtonsPlaceHolder_ButtonNext")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
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
