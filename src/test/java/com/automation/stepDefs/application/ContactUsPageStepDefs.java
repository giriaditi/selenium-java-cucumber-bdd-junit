package com.automation.stepDefs.application;

import org.openqa.selenium.support.PageFactory;
import com.automation.pages.application.ContactUsPage;
import io.cucumber.java.en.And;
import static com.automation.utils.DriverUtils.getDriver;

public class ContactUsPageStepDefs {
    
	ContactUsPage contactUsPage = PageFactory.initElements(getDriver(), ContactUsPage.class);

    @And("^The user fill the contact us form$")
    public void The_user_fill_the_contact_us_form() {
    	contactUsPage.fillContactUsForm();
    }
}
