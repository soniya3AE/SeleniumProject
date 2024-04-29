package SeleniumPro;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assingment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https:www.amazon.in");
		System.out.println(driver.getTitle());
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
        driver.close();
 
        
        
      
        
	}

}
