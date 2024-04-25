package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write an Absolute xpath and relative xpath for the html file(shared my Manish) for all the fields
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/abhishek/Downloads/learningHTML1.html");
		
		//Relative xpath
		/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("soniya");
		driver.findElement(By.xpath("//input[@name='say hello']")).sendKeys("say hello");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("123");	
		//driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Submit']"));
		driver.findElement(By.xpath("(//input[@name='name2'])")).click();
		driver.findElement(By.xpath("//select[@id='Relegion']"));
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])"));
		driver.findElement(By.xpath("(//a)")).click();*/
		
		//Absolute xapth
		driver.findElement(By.xpath("/html/body/input[@id='1']")).sendKeys("abc");		
		driver.findElement(By.xpath("/html/body/input[@name='say hello']")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/form/input[@name='fname']")).sendKeys("123");	
		//driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("123");
		driver.findElement(By.xpath("(/html/body/form/input[@value='Submit'])[1]"));
		driver.findElement(By.xpath("(/html/body/form)[2]/input[@name='name2']")).click();
		driver.findElement(By.xpath("(//html/body/form)[2]/input[@type='submit']"));
		driver.findElement(By.xpath("(//html/body/input)[4]")).click();
		driver.findElement(By.xpath("(//html/body/input)[6]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])"));	
		//driver.findElement(By.linkText("Click to know about us")).click();
		
		WebElement dropDownElement = driver.findElement(By.id("Relegion"));
		Select dropDown = new Select(dropDownElement);
		dropDown.selectByVisibleText("Christian");
		
		driver.findElement(By.xpath("(//input)[14]"));
		
		
		

		

	}

}
