package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
			WebElement categ_dd=	driver.findElement(By.id("searchDropdownBox"));


		Select s1=new Select(categ_dd);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=luggage");	 
		s1.selectByVisibleText("Kindle Store");	
		
	}

}
