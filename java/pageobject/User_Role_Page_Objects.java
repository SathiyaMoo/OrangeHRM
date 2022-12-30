package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Objects {


	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	public static WebElement clickAdmin;

	@FindBy(xpath   ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public static WebElement Addbutton;

	@FindBy(xpath   ="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public static WebElement selectUserroll;

	@FindBy(xpath   ="(//div[@class='oxd-select-option'])[2]")
	public static WebElement selectUserrollAdmin;

	
	@FindBy(xpath   ="(//div[@class='oxd-select-text-input'])[2]")
	public static WebElement StatusSelect;

	@FindBy(xpath   ="(//div[@class='oxd-select-option'])[2]")
	public static WebElement StatusSelectEnabled;
	
	@FindBy(xpath   ="//input[@placeholder='Type for hints...']")
	public static WebElement EmployeeName;
     
	@FindBy(xpath   ="//span[text()='sathiya  M']")
	public static WebElement EmployeeNameAdd;

	@FindBy(xpath   ="(//input[@class='oxd-input oxd-input--active'])[2]")
	public static WebElement Username;

	@FindBy(xpath   ="(//input[@type='password'])[1]")
	public static WebElement password;


	@FindBy(xpath   ="(//input[@type='password'])[2]")
	public static WebElement Confirmpassword;

	@FindBy(xpath  ="(//button[contains(@class,'oxd-button oxd-button--medium oxd-but')])[2]")
	public static WebElement Savebutton;







}