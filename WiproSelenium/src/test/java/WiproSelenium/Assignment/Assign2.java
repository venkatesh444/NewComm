package WiproSelenium.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		d.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		d.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		Alert simp=d.switchTo().alert();
		
		System.out.println(simp.getText());
		simp.accept();

	}

}
