package com.automation.data;

import org.apache.commons.lang.RandomStringUtils;

public class ContactUsFormData {
    
	String firstName;
    String lastName;
    String workEmail;
    String phoneNumber;
    String companyName;
    String websiteURL;
    String yourMessage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setwebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getYourMessage() {
        return yourMessage;
    }

    public void setYourMessage(String yourMessage) {
        this.yourMessage = yourMessage;
    }

    public void generateRandomFormData() {
        firstName = RandomStringUtils.randomAlphabetic(12);
        lastName = RandomStringUtils.randomAlphabetic(8);
        workEmail = RandomStringUtils.randomAlphabetic(8) + "@test.com";
        phoneNumber = RandomStringUtils.randomNumeric(10);
        companyName = RandomStringUtils.randomAlphabetic(10);
        websiteURL = "www." + RandomStringUtils.randomAlphanumeric(5) + ".com";
        yourMessage = RandomStringUtils.randomAlphabetic(15);
    }
}
