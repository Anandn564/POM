package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {
	
	
    WebDriver driver;
	public Facebookpage(WebDriver driver) 
	{
		this.driver = driver;	
	}
	
	//user fields details//
	By Username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	
	//user login details//
	public void EnterUsername() 
	{
		driver.findElement(Username_editbox).sendKeys("Testuser");
	}
	
	//user password details//
	public void Enterpassword() 
	{
		driver.findElement(password_editbox).sendKeys("Tester123");
	}
	
	//click on login button//
	public void VerifyLogin() 
	{
		driver.findElement(Login_Btn).click();
		String title = driver.getTitle();
		assertEquals(title, "Login page");
		
	}
}
