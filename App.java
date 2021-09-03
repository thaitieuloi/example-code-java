package com.ttl.maven;

import java.awt.AWTException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	
	/**
	 * @author Thái Tiểu Lôi
	 * @throws InterruptedException
	 * @throws AWTException 
	 */
	public static void runChromeDriver() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		// Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		// Deleting all the cookies
		driver.manage().deleteAllCookies();

		// Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launching the specified URL
		driver.get("https://phptravels.org/index.php?rp=/login");

		WebElement element = driver.findElement(By.xpath("//*[@id='login']"));
		
		WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
		
		Thread.sleep(10000);
		
		// quit driver
		driver.quit();
	}
	
	
	
    public static void main( String[] args )
    {
    	try {
    		runChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
