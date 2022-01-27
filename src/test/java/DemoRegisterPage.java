import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoRegisterPage extends BaseClass {
      public DemoRegisterPage() {
     
		PageFactory.initElements(driver, this);
	}
      
      @FindBy(id="userName")
      WebElement TxtUser;
      
      @FindBy(id="userEmail")
      WebElement TxtEmail;
      
      @FindBy(id="currentAddress")
      WebElement Txtaddress;
      
      @FindBy(id="permanentAddress")
      WebElement TxtPerAddress;

	public WebElement getTxtUser() {
		return TxtUser;
	}

	public WebElement getTxtEmail() {
		return TxtEmail;
	}

	public WebElement getTxtaddress() {
		return Txtaddress;
	}

	public WebElement getTxtPerAddress() {
		return TxtPerAddress;
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}

