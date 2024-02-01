package apple.mac;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	

	    protected WebDriver driver;

	    public BaseClass(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToLoginPage() {
	        // Implementation to navigate to the login page
	    }

	    public void clickHomeButton() {
	        // Implementation to click the home button
	    }

	    // Other common Selenium methods
	}


