package SeleniumPro;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingmet6Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
       WebElement loginButton = driver.findElement(By.id("login_Layer"));
       loginButton.click();
       
       WebElement googleSing = driver.findElement(By.xpath("//div[@class='google']"));
       Thread.sleep(3000);
       googleSing.click();
       
     
	}

}
