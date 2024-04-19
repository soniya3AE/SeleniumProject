package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeDriver driver = new ChromeDriver();	
driver.get("file:///Users/abhishek/Downloads/learningHTML1.html");
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("hello");
	}

}
