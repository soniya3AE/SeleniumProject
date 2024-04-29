package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();

		//WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
	//	category_dd.click();
	//	Thread.sleep(3000);

		WebElement select_book = driver.findElement(By.id("searchDropdownBox"));

		select_book.click();
		for (int i = 0; i <= 11; i++) {
			select_book.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		}
		select_book.sendKeys(Keys.ENTER);

	}

}
