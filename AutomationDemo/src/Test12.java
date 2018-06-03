
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",  ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("");
		List<WebElement> allTxtBx=driver.findElements(By.xpath("//input[@text='text']"));
		for(int i=0;i<5;i++) {
			Thread.sleep(1000);
			allTxtBx.get(i).sendKeys("selenium");
		}
		
		
		
	}
	

}
