package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("https://grotechminds.com/registration/");
		WebElement userName = driver.findElement(By.id("fname"));
		userName.sendKeys("soniya");
		userName.sendKeys(Keys.COMMAND+"A");
		WebElement lasName = driver.findElement(By.id("lname"));
		lasName.sendKeys(Keys.COMMAND+"V");
		
		
	}

}
