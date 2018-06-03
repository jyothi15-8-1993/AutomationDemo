import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.acttime.com/samrtapp/login.do");;
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jyoth42921");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("5E9uSy6y");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		WebElement errMsg=driver.findElement(By.xpath("//span[@class='errmsg'](1)"));
		WebDriverWait wait= new WebDriverWait(driver,4);
		wait.until(ExpectedConditions.visibilityOf(errMsg));
		if(errMsg.isDisplayed()) {
			System.out.println("Test PASS.Error Message is Displayed");
		}
		else {
			System.out.println("Test FAIL.Error Message is not Displayed");
		}
		
		

	}

}
