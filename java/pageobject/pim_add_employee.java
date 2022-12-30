package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pim_add_employee {
	

	@FindBy(xpath   ="//a[@class='oxd-main-menu-item active']")
	public static WebElement pimbuttonclick;
	

	@FindBy(xpath   ="(//button[@type='button'])[3]")
	public static WebElement employee_add_button;
	

	@FindBy(xpath   ="//input[@name='firstName']")
	public static WebElement employee_firstname;
	

	@FindBy(xpath   ="//input[@name='lastName']")
	public static WebElement empoloyee_lastname;
	

	@FindBy(xpath   ="(//button[contains(@class,'oxd-button oxd-button--medium')])[2]")
	public static WebElement savebutton;

}
