import org.openqa.selenium.interactions.SendKeysAction;

public class Google extends BaseClass{
	public static void main(String[] args) {
		chromeDriver();
		launchUrl("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		wait(20);
		GoogleRegisterPage gp=new GoogleRegisterPage();
		sendKeys(gp.TxtFirst, "sowmiya");
		sendKeys(gp.Txtlast, "kannan");
		sendKeys(gp.TxtEmail, "ksowmiya96@");
		sendKeys(gp.TxtPass, "988762");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
