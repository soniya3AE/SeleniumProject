package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Before clicking on link image :"+title);
	    WebElement imageLink = 	driver.findElement(By.linkText("Images"));
	    imageLink.click();
	    String afterTitleIs = driver.getTitle();
	    System.out.println(" After click on the image link:"+afterTitleIs);

	    
	    

	}

}
