import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleRegisterPage extends BaseClass{
	public GoogleRegisterPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	WebElement TxtFirst;
	
	@FindBy(id="lastName")
	WebElement Txtlast;
	
	@FindBy(id="username")
	WebElement TxtEmail;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement TxtPass;

	public WebElement getTxtFirst() {
		return TxtFirst;
	}

	public WebElement getTxtlast() {
		return Txtlast;
	}

	public WebElement getTxtEmail() {
		return TxtEmail;
	}

	public WebElement getTxtPass() {
		return TxtPass;
	}
	
	
	
	

}
