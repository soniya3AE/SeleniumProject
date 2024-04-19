package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverInAmazonEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(e1).perform();
		
	}

}
