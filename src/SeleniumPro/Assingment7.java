package SeleniumPro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assingment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
        SafariDriver driver1 = new SafariDriver();
        driver1.manage().window().maximize();
        driver1.get("https:www.amazon.com");
        String title = driver1.getTitle();
        System.out.println(title);
        driver1.close();

	}

}
