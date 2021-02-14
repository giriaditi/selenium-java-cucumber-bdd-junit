package com.automation.pages.application;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.pages.BasePage;

public class HomePage extends BasePage {
    
	public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[title='Search']")
    private  WebElement googleSearchBar;
    
    @FindBy(css = ".FPdoLc input[name='btnK']")
    private  WebElement googleSearchButton;
    
    @FindBy(css = ".yuRUbf a[href='https://www.securepay.com.au/']")
    private  WebElement securePayGoogleLink;
    
    @FindBy(css = ".c-site-footer ul ul a")
    private  List<WebElement> footerLinks;
    
    @FindBy(css = "input[name='firstName']")
    private WebElement firstName;
    
	public void enterSearchText(String searchText) {
		googleSearchBar.clear();
		googleSearchBar.sendKeys(searchText);
	}

	public void clickOnSearchButton() {
		googleSearchButton.click();
		waitForElementToBeClickable(securePayGoogleLink);
	}

	public void clickOnSecurePayGoogleLink() {
		securePayGoogleLink.click();
		waitForElementToBeClickable(footerLinks.get(11));
	}
	
	public void clickOnContactUsLink() throws InterruptedException {
		scrollToElement(footerLinks.get(11));
		footerLinks.get(11).click();
		waitForToBeVisible(firstName);
	}
}
