
package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SoniyaoldAssingment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* login to amazon*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement singin = driver.findElement(By.id("nav-link-accountList"));
		System.out.println(singin.getText());
		Actions action = new Actions(driver);                              
		action.moveToElement(singin).perform();
		singin.click();
		WebElement  phoneNumber = driver.findElement(By.id("ap_email"));
		phoneNumber.sendKeys("7406501839");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("abc");
		
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
		
		
		
		
		
	}

}
