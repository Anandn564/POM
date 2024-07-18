package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchpage {
	
	WebDriver driver;
	
	public Googlesearchpage(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		this.driver = driver;
		
	}
	
	By searchbox = By.xpath("//*[@name='q']");
	By Search_btn = By.xpath("(//*[@name='btnK'])[1]");
	By Facebook_link = By.xpath("//*[text()='Facebook - log in or sign up']");
	

	public void searchgoogle(String Searchinput) {
		// TODO Auto-generated method stub//
		try {
		driver.findElement(searchbox).sendKeys(Searchinput);
		Thread.sleep(1000);
		driver.findElement(Search_btn).click();
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println("Exceptions caught" + e.getMessage());
	}
	}
	
	public void ClickFacebook() {
		try 
		{
		driver.findElement(Search_btn).click();
		Thread.sleep(5000);
		}
		catch (Exception e) 
		{
		System.out.println("Exceptions caught" + e.getMessage());
	}
	}
}
