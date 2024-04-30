
package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		
		WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
		
		Select dropDown = new Select(category_dd);
		dropDown.selectByVisibleText("Books");
	    
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("wold war");
		searchBox.sendKeys(Keys.ENTER);
		
	}

}
