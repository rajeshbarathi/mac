package apple.mac.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.apple.pages.LoginPage;

import apple.mac.BaseClass;
import apple.mac.DriverManager;
import apple.mac.PageObjectManager;

public class LoginStepDef {
	WebDriver driver = DriverManager.getDriver();
	PageObjectManager pageObjectManager = new PageObjectManager(driver);
	LoginPage loginPage = pageObjectManager.getLoginPage();
	BaseClass base = new BaseClass(driver);
}
