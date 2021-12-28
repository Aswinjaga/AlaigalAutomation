package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InviteGuestElement {

	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[8]")
	public static WebElement guest;
	
	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[23]")
	public static WebElement inviteGuestBtn;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public static WebElement guestName;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	public static WebElement companyName;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	public static WebElement companyAdreess;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	public static WebElement contactNo;
	
	@FindBy(xpath = "(//input[@class='form-control'])[5]")
	public static WebElement email;
	
	@FindBy(xpath = "(//input[@class='form-control'])[6]")
	public static WebElement idproof;
	
	@FindBy(xpath = "(//input[@class='form-control'])[7]")
	public static WebElement businesscard;
	
	@FindBy(xpath = "(//input[@class='form-control'])[8]")
	public static WebElement profilePic;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement inviteSubmit;
	
}
