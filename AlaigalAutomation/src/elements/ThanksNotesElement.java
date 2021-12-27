package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThanksNotesElement {
	
	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[7]")
	public static WebElement thanksNotesBtn;
	
	@FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[7]/ul/li[1]/a/span")
	public static WebElement thanksNotes;
	
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	public static WebElement thanksNotesSelect;
	
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	public static WebElement thanksNotesDate;

	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	public static WebElement thanksNotesAmount;
	
	@FindBy(xpath = "(//*[@class='form-control'])[4]")
	public static WebElement thanksNotesDescription;
	
	@FindBy(xpath = "//*[@id='submitbtn']")
	public static WebElement thanksNotesSubmit;
}
