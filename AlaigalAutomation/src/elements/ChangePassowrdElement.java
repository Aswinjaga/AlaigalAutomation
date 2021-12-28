package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassowrdElement {
	
	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[3]")
	public static WebElement memberProfile;
	
	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[8]")
	public static WebElement changePassword;
	
	@FindBy(xpath = "//*[@name='old_password']")
	public static WebElement oldPassword;
	
	@FindBy(xpath = "//*[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@name='confirmpassword']")
	public static WebElement repeatPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement changePasswordsubmit;
	
	
}
