package testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Facebookpage;
import Objects.Googlesearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmethod_Googlesearch {
	WebDriver driver;
	Googlesearchpage objectrepo;
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@Test(priority = 0)
	public void Searchoperation() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		Googlesearchpage page = new Googlesearchpage(driver);
		page.searchgoogle("facebook");
		
	}
	
	@Test(priority = 1)
	public void VerifyandAccessFacebook() {
		objectrepo = new Googlesearchpage(driver);
		objectrepo.ClickFacebook();
	}
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		Facebookpage page = new Facebookpage(driver);
		page.EnterUsername();
		page.Enterpassword();
		page.VerifyLogin();
	}
	
	//@AfterTest
	public void aftertest( ) {
		driver.quit();
	}//


}
