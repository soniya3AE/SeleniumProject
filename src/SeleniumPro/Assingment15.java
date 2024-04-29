package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		 String title = 	driver.getTitle();
		System.out.println("title is : "+ title);
		
		driver.manage().window().maximize();
		WebElement customerService = driver.findElement(By.linkText("Customer Service"));
		customerService.click();
		
	    String Aftertitle = 	driver.getTitle();
	    System.out.println("Aftertitle is : "+ Aftertitle);
	    
	    WebElement yourOrder = driver.findElement(By.xpath("//div[@class='a-box-inner']//img[@alt='Your Orders']"));
	    yourOrder.click();

	}

}
