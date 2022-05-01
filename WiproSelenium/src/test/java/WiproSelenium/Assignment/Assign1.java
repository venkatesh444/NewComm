package WiproSelenium.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign1 {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOYA'S\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Veera venkatesh");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Loya");
		d.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Hyderabad");
		d.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		d.findElement(By.xpath("//input[@id='checkbox1']")).click();
		d.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement> options=d.findElements(By.xpath("//section[@id='section']//li"));
		System.out.println(options.size());
		for(int i=0;i<options.size();i++) {
			
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("English")) {
				options.get(i).click();
				break;
			}
		}
		
		Select sc=new Select(d.findElement(By.xpath("//select[@id='Skills']")));
		
		sc.selectByVisibleText("Java");
		
       
		
	}

}
