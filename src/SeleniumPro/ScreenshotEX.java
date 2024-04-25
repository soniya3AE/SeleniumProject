package SeleniumPro;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEX {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("bangalore");
		Thread.sleep(4000);
		List<WebElement> a1=		driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count=	a1.size();
		System.out.println(count);
		
		a1.get(count-4).click();
		
			ChromeDriver t1=					driver;
		File source=			t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\MKTProject\\Selenium_program\\src\\Batch40\\sunmoon.png");
		FileHandler.copy(source, destination);

	}

}
