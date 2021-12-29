package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnSpotElement {
	
	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[10]")
	public static WebElement spotBtn;
	
	@FindBy(xpath = "//*[@style='width: 18%;margin-left:auto;']/child::span")
	public static WebElement spotaddbtn;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	public static WebElement spotrefby;
	
	@FindBy(xpath = "//input[@id='guest_name']")
	public static WebElement spotguestName;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	public static WebElement spotindustry;
	
	@FindBy(xpath = "//input[@id='company_name']")
	public static WebElement spotcompanyNAme;
	
	@FindBy(xpath = "//input[@id='company_address']")
	public static WebElement spotcompanyAddress;
	
	@FindBy(xpath = "(//select[@class='form-control'])[3]")
	public static WebElement spotcity;
	
	@FindBy(xpath = "(//select[@class='form-control'])[4]")
	public static WebElement spotstate;
	
	@FindBy(xpath = "//input[@id='phone']")
	public static WebElement spotcontactNo;
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement spotEmali;
	
	@FindBy(xpath = "//input[@id='id_proof']")
	public static WebElement spotidprrof;
	
	@FindBy(xpath = "//input[@id='business_card']")
	public static WebElement spotBusinessCard;
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	public static WebElement spotSubmitButton;
}



