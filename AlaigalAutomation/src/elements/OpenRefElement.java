package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenRefElement {
	
	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[13]")
	public static WebElement refBtn;
	
	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[14]")
	public static WebElement OpenRefBtn;
	
	@FindBy(xpath = "//*[@name='pro_title']")
	public static WebElement OpenProposedTitle;
	
	@FindBy(xpath = "//*[@name='due_date']")
	public static WebElement OpenDueDate;
	
	@FindBy(xpath = "//*[@id='amount']")
	public static WebElement OpenAmount;
	
	@FindBy(xpath = "//*[@name='pro_des']")
	public static WebElement OpenDescription;
	
	@FindBy(xpath = "//*[@id='submitbtn']")
	public static WebElement OpenSubmit;

}
