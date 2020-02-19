package etsyPkg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyJob {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();

		
		// SIGN IN
		
		driver.findElement(By.xpath("//*[@id='gnav-header-inner']/div[4]/nav/ul/li[1]/button")).click();			
		Thread.sleep(2000);
		// REGISTER
		
		driver.findElement(By.xpath("//*[@id='join-neu-form']/div[1]/div/div[1]/div/button")).click();
		
		Thread.sleep(3000);
		
		// ENTER EMAIL
		
		driver.findElement(By.xpath("//input[@id='join_neu_email_field']")).sendKeys("carrots@gmail.com");
		
		// ENTER FIRST NAME
		
		driver.findElement(By.xpath("//input[@id='join_neu_first_name_field']")).sendKeys("carrot");
		
		// ENTER PASSWORD
		
		driver.findElement(By.xpath("//input[@id='join_neu_password_field']")).sendKeys("orange!23");
		
		// CLICK ON THE REGISTER BUTTON
		
		driver.findElement(By.xpath("//button[@name='submit_attempt']")).click();
		
		Thread.sleep(3000);
		
		// WE NEED A SIGN IN OPTION ON THE WEBPAGE AFTER THE REGISTRATION PROCESS TO REGISTER NEXT CUSTOMER DURING THE PROCESS OF 
		// AUTOMATION. BUT AFTER WE REGISTER CUSTOMER PROFILE IS CREATED AND THERE IS NO SIGN IN OPTION. SO WE NEED TO SIGN OUT --> SIGN IN
		// OPTION DISPLAYS AND THE REGISTRATION PROCESS CONTINUES FOR ALL THE CUSTOMERS (ROWS) IN THE EXCEL FILE. 
		
		// LOCATE THE ELEMENT PROFILE TO ACCESS SIGNOUT OPTION
		
		WebElement profile = driver.findElement(By.xpath("//span[@class='nav-icon nav-icon-image nav-icon-circle']"));
		
		// WHEN PROFILE IS DISPLAYED, CLICK ON THAT 
		
		if(profile.isDisplayed())
		{
			profile.click();
			
			Thread.sleep(3000);
			
			// CLICK ON SIGN OUT
			
			driver.findElement(By.xpath("//div[4]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		}	

	}


}
