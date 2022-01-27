import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends BaseClass{
	public Registerpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	WebElement createBtn;
	
	@FindBy(name="firstname")
	WebElement TxtFirst;
	
	@FindBy(name="lastname")
	WebElement Txtlast;
	
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	WebElement TxtMob;
	
	@FindBy(xpath="//input[@data-type='password']")
	WebElement TxtPass;
	
	@FindBy(id="day")
	WebElement dropDay;
	
	@FindBy(id="month")
	WebElement dropMonth;
	
	@FindBy(id="year")
	WebElement dropYear;
	
	@FindBy(xpath="(//label[@class='_58mt'])[1]")
	WebElement radioBtn;
	
	
	
	public WebElement getCreateBtn() {
		return createBtn;
	}



	public WebElement getTxtFirst() {
		return TxtFirst;
	}



	public WebElement getTxtlast() {
		return Txtlast;
	}



	public WebElement getTxtMob() {
		return TxtMob;
	}



	public WebElement getTxtPass() {
		return TxtPass;
	}



	public WebElement getDropDay() {
		return dropDay;
	}



	public WebElement getDropMonth() {
		return dropMonth;
	}



	public WebElement getDropYear() {
		return dropYear;
	}



	public WebElement getRadioBtn() {
		return radioBtn;
	}



//	public Select getS() {
//		return s;
//	}
//	Select s=new Select();
//	
	
	

}
