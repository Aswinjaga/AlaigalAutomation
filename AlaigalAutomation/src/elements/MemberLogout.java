package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberLogout {
	
	@FindBy(xpath = "(//*[@class=\'menu-title text-truncate\'])[10]")
	public static WebElement logOut;

}
