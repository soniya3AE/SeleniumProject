package JavaScriptPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEX1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement serach=	driver.findElement(By.xpath("//button[.='Click ']"));
		serach.click();//birth to java script pop up
		Thread.sleep(2000);
			driver.switchTo().alert().accept();//handled the JSP
			Thread.sleep(2000);
			//serach.click();//birth to java script pop up

	}

}
