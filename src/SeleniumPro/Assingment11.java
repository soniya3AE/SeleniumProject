package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title is : "+ title);
		
		Actions action = new Actions(driver);
		WebElement singin = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(singin);
		singin.click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("7406501839");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("Amma@123");
		
		WebElement singinButton = driver.findElement(By.id("signInSubmit"));
		singinButton.click();
		

	}

}
