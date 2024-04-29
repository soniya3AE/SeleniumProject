package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("fname"));
		WebElement lastName = driver.findElement(By.id("lname"));

		firstName.sendKeys("soniya");
		firstName.sendKeys(Keys.COMMAND, "a");
		firstName.sendKeys(Keys.COMMAND, "c");
		lastName.sendKeys(Keys.COMMAND, "v");
		
				//soniya
				
		
		

	}

}
