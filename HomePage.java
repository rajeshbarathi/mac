package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "homeButton")
    private WebElement homeButton;

    // Other locators and methods related to the home page

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
