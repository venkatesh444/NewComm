package WiproSelenium.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		d.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outer=d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(outer);
		
		WebElement inner=d.findElement(By.xpath("/html/body/section/div/div/iframe"));
		d.switchTo().frame(inner);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Venkat");
	}

}
