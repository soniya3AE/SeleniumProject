package SeleniumPro;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleChormeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/grid/getting_started/");
		
		//close the current session
		//driver.close();
		//driver.quit();

	}

}
