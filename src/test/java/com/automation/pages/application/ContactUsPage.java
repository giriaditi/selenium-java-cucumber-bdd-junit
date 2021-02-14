package com.automation.pages.application;

import com.automation.data.ContactUsFormData;
import com.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    
	public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='firstName']")
    private WebElement firstName;
    @FindBy(css = "input[name='firstName']")
    private WebElement lastName;
    @FindBy(css = "input[name='email']")
    private WebElement workEmail;
    @FindBy(css = "input[name='phone']")
    private WebElement phoneNumber;
    @FindBy(css = "input[name='company']")
    private WebElement companyName;
    @FindBy(css = "input[name='website']")
    private WebElement websiteURL;
    @FindBy(css = "select[name='amount']")
    private WebElement businessAmount;
    @FindBy(css = "textarea[name='message']")
    private WebElement yourMessage;

    public ContactUsFormData getRandomUserData() {
        ContactUsFormData contactUsFormData = new ContactUsFormData();
        contactUsFormData.generateRandomFormData();
        return contactUsFormData;
    }

	public void fillContactUsForm() {
		ContactUsFormData contactUsFormData = getRandomUserData();
		firstName.sendKeys(contactUsFormData.getFirstName());
		lastName.sendKeys(contactUsFormData.getLastName());
		workEmail.sendKeys(contactUsFormData.getWorkEmail());
		phoneNumber.sendKeys(contactUsFormData.getPhoneNumber());
		companyName.sendKeys(contactUsFormData.getCompanyName());
		websiteURL.sendKeys(contactUsFormData.getWebsiteURL());
		selectValueFromDropDown(businessAmount, "0");
		yourMessage.sendKeys(contactUsFormData.getYourMessage());
	}
}
