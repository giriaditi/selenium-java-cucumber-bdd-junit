@ContactUsPage
Feature: Contact Us Form
  As a SecurePay website visitor
  I want to access the contact us form
  So that I can submit my query along with my contact details

  Background: User is navigated to the Google search website
    Given The title of the page is displayed as Google
    
  @FillContactUsForm
  Scenario: Fill contact us form on SecurePay website
  	When The user enter SecurePay in google search bar
    And The user click on Google Search button
    And The user click on the SecurePay link in the search result
    Then The title of the page is displayed as SecurePay 
    When The user click on the Contact us link 
    And The title of the page is displayed as Contact SecurePay
    And The user fill the contact us form