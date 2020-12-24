package TestClass;

import org.testng.annotations.BeforeClass;

import WebPageClass.GarageLoginPage;
import WebPageClass.SupplierLoginPage;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected WebDriver driver;
    private Capabilities caps;
    
    private String path="C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\LibraryFiles\\ChromeDriver\\chromedriverV87.exe";
    
    SupplierLoginPage objSupLogin;
    GarageLoginPage objGarLogin;
    
    @BeforeClass()
    public void setup() {
    	ChromeBrowser();
    	ManagerBrowser();
    }
    
    public void ManagerBrowser(){
        driver.manage().window().maximize();
    }
    
    public void ChromeBrowser(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }
    
    public SupplierLoginPage goSupLoginPage(){
    	System.out.println(driver.toString()+" 01");
    	driver.get("https://www.trademartlk.com/operation/dashboard/supplier-login-sqag2");
       	System.out.println(driver.toString()+" 02");
    	return new SupplierLoginPage(driver);
    }
 
    public GarageLoginPage goGarLoginPage(){
    	System.out.println(driver.toString()+" 01");
    	driver.get("https://www.trademartlk.com/operation/dashboard/garage-login-deshan");
       	System.out.println(driver.toString()+" 02");
    	return new GarageLoginPage(driver);
    }
}
