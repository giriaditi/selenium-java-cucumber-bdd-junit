package com.automation.stepDefs.application;

import org.openqa.selenium.support.PageFactory;
import com.automation.pages.application.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import static com.automation.utils.DriverUtils.getDriver;

public class HomePageStepDefs {
    
	HomePage homepage = PageFactory.initElements(getDriver(), HomePage.class);

    @When("^The user enter (.*) in google search bar$")
    public void The_user_enter_text_in_google_search_bar(String searchText) {
        homepage.enterSearchText(searchText);
    }
    
    @And("^The user click on Google Search button$")
    public void The_user_click_on_Google_Search_button() {
        homepage.clickOnSearchButton();
    }
    
    @And("^The user click on the SecurePay link in the search result$")
    public void The_user_click_on_the_SecurePay_link_in_the_search_result() {
        homepage.clickOnSecurePayGoogleLink();
    }
    
    @And("^The user click on the Contact us link$")
    public void The_user_click_on_the_Contact_us_link() throws InterruptedException {
        homepage.clickOnContactUsLink();
    }
}
