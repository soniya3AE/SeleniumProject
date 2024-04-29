package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://grotechminds.com/dropdown/
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		
		driver.manage().window().maximize();
		
		WebElement selectOption2_dd = driver.findElement(By.id("Choice1"));
		
		Select dropDown = new Select(selectOption2_dd);
		dropDown.selectByVisibleText("Demo2");
		
		

	}

}
