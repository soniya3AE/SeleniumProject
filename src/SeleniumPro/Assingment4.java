package SeleniumPro;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
