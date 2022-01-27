import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Face extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chromeDriver();
		launchUrl("https://www.facebook.com/");
		wait(20);
		Registerpage r=new Registerpage();
		click(r.createBtn);
		
		
		sendKeys(r.TxtFirst, "sowmiya");
		sendKeys(r.Txtlast,"kannan");
		sendKeys(r.TxtMob, "987654321");
		sendKeys(r.TxtPass, "sowmi");
		selectByIndex(r.dropDay, 11);
		selectByIndex(r.dropMonth, 5);
		selectByVisibleText(r.dropYear, "1996");
		click(r.radioBtn);
	
		
		
	}}
