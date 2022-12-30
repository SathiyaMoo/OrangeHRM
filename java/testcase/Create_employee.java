package testcase;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfile.CommonFunctions;
import pageobject.Dashboard_page_objcet;
import pageobject.Loginpage;


public class Create_employee extends CommonFunctions{


	public void login() throws InterruptedException {
		PageFactory.initElements(driver, Loginpage.class);
		Thread.sleep(3000);

		Loginpage.username.sendKeys(properties.getProperty("username"));

		Loginpage.password.sendKeys(properties.getProperty("password"));

		Loginpage.loginbutton.click();
	}
	@Test
	public void getPendingLeaveRquests() throws InterruptedException, IOException {
		login();
		PageFactory.initElements(driver, Dashboard_page_objcet.class);
		Thread.sleep(3000);
		File leavepage  = driver.getScreenshotAs(OutputType.FILE);
		File copy = new File ("./snaps/leave.png");
		FileUtils.copyFile(leavepage, copy);
		String actualMessage = Dashboard_page_objcet.LeaveRequest.getText();

		Assert.assertEquals(actualMessage, "(14) Leave Requests to Approve");


	}


	






























	/*public void ptab() throws InterruptedException {

		PageFactory.initElements(driver, pimpage.class);
		Thread.sleep(2000);
		pimpage.pim.click();
		Thread.sleep(2000);

		pimpage.add_employee.click();
		Thread.sleep(3000);
		pimpage.Emp_firstname.sendKeys("sathiya@389");
		pimpage.Emp_lastname.sendKeys("s");

	}
	//@Test

	public void imageupload() throws InterruptedException, AWTException {

		login();
		ptab();

		pimpage.image_button.click();
		Thread.sleep(2000);

		String file =".C/Users/DELL/Downloads/nature.jpg";

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot =new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);


	}
	public void createloginpage() {
		pimpage.logindetailbutton.click();

		pimpage.emp_login_username.sendKeys("tester");

		pimpage.emp_login_password.sendKeys("Sathya@1234");

		pimpage.emp_login_cfmpassword.sendKeys("Sathya@1234");

		pimpage.emp_save.click();
	}

/*	


	}

	public void create_login_details() throws InterruptedException {

		pim_page_objects.logindetailbutton.click();

		pim_page_objects.emp_login_username.sendKeys("tester");

		pim_page_objects.emp_login_password.sendKeys("Abcdef@12345");

		pim_page_objects.emp_login_cfmpassword.sendKeys("Abcdef@12345");

		pim_page_objects.emp_save.click();

	}

	@Test
	public void emp_verification() throws InterruptedException, AWTException {
		login();
		ptab();
		imageupload();
		create_login_details();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String savemsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='oxd-toaster_1']/div/div[1]/div[2]/p[1]"))).getText();
		Assert.assertEquals(savemsg, "Success");*/









}
