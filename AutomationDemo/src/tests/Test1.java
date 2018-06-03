package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actitime.ActiTimeLoginPO;


public class Test1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jackb\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/huawei2/login.do");
		

		ActiTimeLoginPO po=new ActiTimeLoginPO(driver);
		po.unTxtBx().sendKeys("jyoth4292");
		po.pwTxtBx().sendKeys("5E9uSy6y");
		po.loginBtn().click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(po.errormsg()));
		if(po.errormsg().isDisplayed()) {
			System.out.println("Test Pass-Error message is displayed");
		}
		
		else {
			System.out.println("Test fail- error message not displayed");
		}
		
	}

	}

