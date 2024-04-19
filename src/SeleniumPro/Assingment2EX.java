package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingment2EX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions a= new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		a.moveToElement(fashion).perform();
		WebElement Tshirt =driver.findElement(By.linkText("Men's T-Shirts"));

		Thread.sleep(2000);
		Tshirt.click();

	}

}
