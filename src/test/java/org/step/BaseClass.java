package org.step;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
	 else if(browsername.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	}
	 else if(browsername.equalsIgnoreCase("edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	 }
		return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicityWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void sendKeys(WebElement e,String name) {
		e.sendKeys(name);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void quite() {
		driver.quit();

	}
	public static void screenShot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\Downloads\\Mavan_new\\screenshot\\"+name+".png");
		FileUtils.copyFile(src, des);
	}
	public static void javascriptget(WebElement w) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("return arg[0].getAttribute('value')");
	}
	public static void scrolldown(WebElement W) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrolldown(false)");
	}
	public static void scrollup(WebElement W) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrolldown(true)");
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
}
	public static void refresh() {
		driver.navigate().refresh();
	}
    public static void swichtoframe(int index) {
		driver.switchTo().frame(index);

	}
    public static String getwindowhandle() {
		String parentid = driver.getWindowHandle();
		return parentid;
	}
	public static String getwindowhandles(int arg) {
    Set<String> s = driver.getWindowHandles();
    List<String> l=new ArrayList<String>();	
    l.addAll(s);
	return null;
	}
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
       public static void selectByIndex(WebElement web,int index) {
		 Select s=new Select(web);
		 s.selectByIndex(index);
		
	}    
			public static void SelectByvalue(WebElement e,String value) {
				Select s=new Select(e);
      s.selectByValue(value);
			}

		}

	

