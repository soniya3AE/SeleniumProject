package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		String  title = driver.getTitle();
		System.out.println("title");
		
		WebElement gmailLink = driver.findElement(By.partialLinkText("Gmai"));
		gmailLink.click();
		
		System.out.println("after clicking on the gmail link");
		
		String Aftertitle = driver.getTitle();
		System.out.println(Aftertitle);

	}

}
