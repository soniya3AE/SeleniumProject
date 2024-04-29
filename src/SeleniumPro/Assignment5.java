package SeleniumPro;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
        driver.get("https:www.flipcart.com");
        System.out.println(driver.getTitle());
        driver.close();
	}

}
