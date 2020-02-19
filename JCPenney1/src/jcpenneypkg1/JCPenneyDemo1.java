package jcpenneypkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JCPenneyDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jcpenney.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='_2oH0u']")).click();
		driver.findElement(By.xpath("//form[1]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Humpty");
		driver.findElement(By.id("lastName")).sendKeys("Dumpty");
		driver.findElement(By.name("phone")).sendKeys("1247859361");
		driver.findElement(By.id("createAccountEmail")).sendKeys("hdumpty@aol.com");
		driver.findElement(By.name("password")).sendKeys("sat0nAwa11");
		
		System.out.println("Account Creation is Successful!!");
		
		
	}

}
