package SeleniumPro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assingment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		 String title = 	driver.getTitle();
		System.out.println("title is : "+ title);
		
		driver.manage().window().maximize();
		
	WebElement category_dd = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select dropdown = new Select(category_dd);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//dropdown.selectByIndex(2);
	 dropdown.selectByVisibleText("Amazon Devices");
	//dropdown.selectByValue("search-alias=luggage");
	
	
	
		
		
		
		
		
		
		  
		
		
	}

}
