package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		 String title = 	driver.getTitle();
		System.out.println("title is : "+ title);
		
		driver.manage().window().maximize();
		
		
		WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
		
		Select drpDown = new Select(category_dd);
		drpDown.selectByVisibleText("Books");
		
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox .sendKeys("World war");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
		
		
		
		
		
		


	}

}
