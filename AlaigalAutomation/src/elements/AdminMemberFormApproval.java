package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminMemberFormApproval {
	

	
	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[10]")
	public static WebElement memberFormApprovalBtn;

	@FindBy(xpath = "//select[@name='datatable_length']")
	public static WebElement entries;
	
	@FindBy(xpath = "//input[@type='search']")
	public static WebElement memberSearch;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody")
	public static WebElement membertable;
	
	
	
}
