package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assingment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
	
		
		
		
		
		

	}

}
