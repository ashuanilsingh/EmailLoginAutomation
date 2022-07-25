package Hanling_of_Multiple_ElementandLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeOfCheckbox {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashua\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/tags/att_input_type_checkbox.asp");
	
	
	List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	
		
		int size=Allcheckbox.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		

	}

}
