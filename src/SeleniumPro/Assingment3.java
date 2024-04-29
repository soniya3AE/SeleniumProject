package SeleniumPro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		System.out.println("Google launched ");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
