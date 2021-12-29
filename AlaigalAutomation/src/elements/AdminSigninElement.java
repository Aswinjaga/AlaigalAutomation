package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminSigninElement {
	
	@FindBy(id = "details-button")
	public static WebElement advanBtn;
	
	@FindBy(id = "proceed-link")
	public static WebElement proceesBtn;
	
	@FindBy(xpath = "//input[@id='login-email']")
	public static WebElement adminUserName;
	
	@FindBy(xpath = "//input[@id='login-password']")
	public static WebElement adminPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 waves-effect waves-float waves-light']")
	public static WebElement adminsubmitbtn;
	
	

}
