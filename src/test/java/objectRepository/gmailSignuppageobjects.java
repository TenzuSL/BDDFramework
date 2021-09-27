package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailSignuppageobjects {
	
	WebDriver driver;
	
	@FindBy(id ="firstName")
		WebElement firstname;
		
	@FindBy(id ="lastName")
		WebElement lastname;
	
	@FindBy(id ="username")
	WebElement username;
	
	@FindBy(name ="Passwd")
	WebElement password;
	
	@FindBy(name ="ConfirmPasswd")
	WebElement ConfirmPassword;
	
	@FindBy(id ="i3")
	WebElement Showpasswordcheckbox;
	
	@FindBy(className ="VfPpkd-vQzf8d")
	WebElement Nextbutton;
	
	public gmailSignuppageobjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillsignupdeatils(String firstname1, String lastname1, String username1, String pwd1, String confirmpwd1)
	{
		firstname.sendKeys(firstname1);
		lastname.sendKeys(lastname1);
		username.sendKeys(username1);
		password.sendKeys(pwd1);
		ConfirmPassword.sendKeys(confirmpwd1);
	}
	
	public void clickshowpasswordcheckbox()
	{
		Showpasswordcheckbox.click();
	}
	
	public void clicknextbutton()
	{
		Nextbutton.click();
	}
	

}
