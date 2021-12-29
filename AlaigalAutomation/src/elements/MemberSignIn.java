package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberSignIn {
	

	
	@FindBy(xpath = "//*[@id=\'login-email\']")
	public static WebElement eMail;	
	
	@FindBy(xpath = "//*[@id=\'login-password\']")
	public static WebElement passWord;
	
	@FindBy(xpath = "//*[@class=\'btn btn-primary w-100 waves-effect waves-float waves-light\']")
	public static WebElement loginBtn;
	
	@FindBy(xpath = "//button[@id='details-button']")
	public static WebElement advanced;
	
	@FindBy(linkText = "Proceed to myvideoscript.com (unsafe)")
	public static WebElement proccedLink;

}
