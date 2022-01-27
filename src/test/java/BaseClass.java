import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
		public static  WebDriver chromeDriver() {
			WebDriverManager.chromedriver().setup();
			return driver=new ChromeDriver();
			}
		
		public static void launchUrl(String e) {
			driver.get(e);
		}
		
		public static void wait(int s) {
			driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		
		public static   String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;

		}
		public static String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		public static void sendKeys(WebElement e,String value) {
			e.sendKeys(value);
		}
		
		public static void click(WebElement e) {
			e.click();
			
		}
		
		public static void moveToElement(WebElement target) {
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();
		}
		public static void DragandDrop(WebElement src,WebElement target) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, target).perform();
		}
			public static void selectByIndex(WebElement e,int i ) {
				Select s=new Select(e);
				s.selectByIndex(i);
			}
			
		public static void doubleClick(WebElement e) {
			Actions a=new Actions(driver);
			a.doubleClick(e).perform();
		}	
		public static void keyPad(int code,int intcode) throws AWTException {
			Robot r=new Robot();
			r.keyPress(code);
			r.keyRelease(intcode);
			
		}
		
		public static void sleep(long t) throws InterruptedException {
			Thread.sleep(t);
		}
		public static void quit() {
			driver.quit();
		}
		public static void close() {
			driver.close();
			
		}
		
	public static void contextclick(WebElement target) {
		Actions a=new Actions(driver);	
		a.contextClick(target).perform();
		
		}
	public static void selectByValue(WebElement Target,String value) {
		Select s=new Select(Target);
		s.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement Target,String value) {
		Select s=new Select(Target);
		s.selectByVisibleText(value);
	}
	public static void deSelectByIndex(WebElement Target,int i) {
		Select s=new Select(Target);
		s.deselectByIndex(i);

	}
	public static void deSelectByValue(WebElement Target,String value) {
		Select s=new Select(Target);
		s.deselectByValue(value);

	}
	public static void deSelectByVisibleText(WebElement target,String value) {
		Select s=new Select(target);
		s.deselectByVisibleText(value);
	}
			
	public static void deSelectAll(WebElement target) {
		Select s=new Select(target);
		s.deselectAll();
	}
	
	public static boolean isMultiple(WebElement Target) {
		Select s=new Select(Target);
		boolean multiple = s.isMultiple();
		return multiple;

	}
	public static List getOptions(WebElement Target) {
		Select s=new Select(Target);
		List<WebElement> options = s.getOptions();
		return options;
		
	}		
	public static int size(WebElement Target) {
		Select s=new Select(Target);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		return size;
	}	
	
	public static String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public static Set getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
			
	public static void javaExcecutor() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	}	
			
	public static void screenShot() {
		TakesScreenshot tk =(TakesScreenshot)driver;
	}		
	
			
			
			
			
			
			
			
			
			
			
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

