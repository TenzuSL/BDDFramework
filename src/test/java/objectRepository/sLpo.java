package objectRepository;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sLpo {

	 WebDriver driver;
	
	 	@FindBy(id = "id_username")
	 	WebElement 	Eml;
	 	
		@FindBy(id = "id_password")
	 	WebElement 	Pwd;
		
		@FindBy(className = "icon-user")
	 	WebElement 	Loginbtn;
	 	
		/*By Txt_Email = By.id("id_username");
		By Txt_Password = By.id("id_password");
		By Txt_Loginbutton = By.className("icon-user");*/
		
		
		
		

		public sLpo(WebDriver driver) {
			this.driver = driver;
		PageFactory.initElements(driver, this);
			
		}

		public void enterUsername(String email ) {
			Eml.sendKeys(email);
		}
		
		public void enterPassword( String pwd) {
			Pwd.sendKeys(pwd);
		}
		
		public void clickLoginbutton( ){
			Loginbtn.click();			
		}
		
		
		
}
