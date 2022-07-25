package Hanling_of_Multiple_ElementandLink;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emaillogin {
	@Test
	public void login() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashua\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("8308631499");

driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
