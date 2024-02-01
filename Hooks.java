package apple.mac.stepDefinitions;

import org.openqa.selenium.WebDriver;

import apple.mac.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	  @Before
	    public void setUp() {
	        WebDriver driver = DriverManager.getDriver();
	        // Other setup logic if needed
	    }

	    @After
	    public void tearDown() {
	        DriverManager.quitDriver();
	    }
}
