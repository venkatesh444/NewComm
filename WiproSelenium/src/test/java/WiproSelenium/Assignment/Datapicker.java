package WiproSelenium.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Datepicker.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		String date="25";
		String year="2022";
		String month="December";
		
		d.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		while(true) {
			String monyear=d.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			//System.out.println(monyear);
			String arr[]=monyear.split(" ");
			String mon=arr[0];
			String yea=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yea.equalsIgnoreCase(year)) {
				break;
			}
			else
				d.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		List<WebElement> alldates=d.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
		
		for(WebElement we:alldates) {
			
			String st=we.getText();
			if(st.equalsIgnoreCase(date)) {
				we.click();
				break;
			}
		}
		

	}

}
