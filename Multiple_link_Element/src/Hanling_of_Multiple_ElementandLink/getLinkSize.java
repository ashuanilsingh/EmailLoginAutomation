package Hanling_of_Multiple_ElementandLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinkSize {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement>Alllink=driver.findElements(By.xpath("//a"));
		
		int size =Alllink.size();
		System.out.println(size);//pura ka purafacebook ka size deta h in form of int
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
