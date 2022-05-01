package WiproSelenium.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ekart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		Actions actions = new Actions(d);
		WebElement menuOption = d.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
    	//Mouse hover menuOption 'Music'
    	actions.moveToElement(menuOption).perform();
    	/*String des=d.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@title='Faded Short Sleeve T-shirts'][normalize-space()='Faded Short Sleeve T-shirts']")).getText();
    	System.out.println(des);
    	String price=d.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='right-block']//span[@class='price product-price'][normalize-space()='$16.51']")).getText();
    	System.out.println(price);
    	d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);*/
		d.findElement(By.xpath("(//span[text()='Add to cart'])[1]")).click();
	}

}
