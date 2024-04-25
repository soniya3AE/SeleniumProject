package ScreenshotPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 WebElement googleSearchBox = driver.findElement(By.name("q"));
		 googleSearchBox.sendKeys("Hello");
		 
			/*ChromeDriver t1=					driver;
			File source=			t1.getScreenshotAs(OutputType.FILE);
			File destination=new File("/Users/abhishek/soniya-eclipse-workspace/Selenium2/screenshots/image1.png");
			FileHandler.copy(source, destination);*/
			
			
			ChromeDriver t2 = driver;
			File source1 = t2.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("/Users/abhishek/soniya-eclipse-workspace/Selenium2/screenshots/image2.png");
			
		
	}

}
