package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import elements.MemberLogout;
import elements.MemberSignIn;



public class BaseClass {
	
	public static WebDriver driver;
	public static Properties getprop;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, MemberSignIn.class);
		PageFactory.initElements(driver, MemberLogout.class);;
		return driver;
	}
		public static Properties properties() throws IOException {
			
			FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\AlaigalAutomation\\testData.properties");
			getprop= new Properties();
			getprop.load(fs);
			return getprop;
	}

}
