package testcase;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfile.CommonFunctions;
import pageobject.Loginpage;
import pageobject.User_Role_Page_Objects;

public class Test_User_Role extends CommonFunctions {

	public void login() throws InterruptedException {
		PageFactory.initElements(driver, Loginpage.class);
		Thread.sleep(3000);

		Loginpage.username.sendKeys(properties.getProperty("username"));

		Loginpage.password.sendKeys(properties.getProperty("password"));

		Loginpage.loginbutton.click();	
	}

	public void moveUserRolePage() throws InterruptedException {
		PageFactory.initElements(driver, User_Role_Page_Objects.class);
		Thread.sleep(3000);
		User_Role_Page_Objects.clickAdmin.click();
		User_Role_Page_Objects.Addbutton.click();
	}

	public void selectUserRole() throws InterruptedException {
		Thread.sleep(3000);
		User_Role_Page_Objects.selectUserroll.click();
		User_Role_Page_Objects.selectUserrollAdmin.click();

	}

	public void SelectStatus() throws InterruptedException {
		
		User_Role_Page_Objects.StatusSelect.click();
		User_Role_Page_Objects.StatusSelectEnabled.click();


	}
	@Test
	public void checkUserRole() throws InterruptedException {
		login();
		moveUserRolePage();
		selectUserRole();
		SelectStatus();
		User_Role_Page_Objects.password.sendKeys("Sathiya@3899");
		User_Role_Page_Objects.EmployeeName.sendKeys("sathiya M");
		Thread.sleep(3000);
		User_Role_Page_Objects.EmployeeNameAdd.click();
		
		User_Role_Page_Objects.Username.sendKeys("sivakumar123");
	    
		User_Role_Page_Objects.Confirmpassword.sendKeys("Sathiya@3899");
		User_Role_Page_Objects.Savebutton.click();

	}

}
