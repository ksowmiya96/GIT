import org.openqa.selenium.chrome.ChromeDriver;

public class Demo extends BaseClass {
	public static void main(String[] args) {
	chromeDriver();
	launchUrl("https://demoqa.com/text-box");
	wait(20);
	DemoRegisterPage dp=new DemoRegisterPage();
	
	sendKeys(dp.TxtUser,"sowmiya");
	sendKeys(dp.TxtEmail,"ksowmiya96@gmail.com");
	sendKeys(dp.Txtaddress, "147,2nd main ");
	sendKeys(dp.TxtPerAddress, "147,2pl");
	
		
	}

}
