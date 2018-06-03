package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import actitime.ActiTimeLoginPO;



public class Test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jackb\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.acttime.com/samrtapp/login.do");

		
		ActiTimeLoginPO log=new ActiTimeLoginPO(driver);
		log.unTxtBx().sendKeys("jyoth42921");
		log.pwTxtBx().sendKeys("5E9uSy6y");
log.loginBtn().click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(log.errormsg()));
		if(log.errormsg().isDisplayed()) {
			System.out.println("Test Pass-Error message is displayed");
		}
		
		else {
			System.out.println("Test fail- error message not displayed");
		}
}


}
