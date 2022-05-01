package WiproSelenium.Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		d.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
		d.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		
		String parent=d.getWindowHandle();
		
		Set<String> child=d.getWindowHandles();
		
		Iterator<String> it=child.iterator();
		
		while(it.hasNext()) {
			 String childWin = it.next();
	            
	            if(!parent.equals(childWin)) {
	                
	            d.switchTo().window(childWin);
	            
	            // Verify title of the child window
	            System.out.println(d.getTitle());
		}
		
	}
	}
}
