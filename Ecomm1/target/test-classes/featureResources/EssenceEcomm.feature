#Author: your.email@your.domain.com
Feature: Testing Essence Ecomm Homepage, Checkout, Add to Cart Functionalities.

  @Smoke
  Scenario: Use different locators to test elements like textboxes, buttons,
    checkboxes, and radio buttons on the application.

    Given open Essence Ecomm WebApp.
    Then hover on pages and click home
    Then hover on pages and click contact
    And accept the alerts
    Then Hover on shop and click Dresses
    And select a dress
    Then If the user is able to click on the Add to Cart button
    Then If the user is able to click on the Checkout button
    Then If the user is able to add all required details in the Billing Address page
    Then If the user is able to click on the Place Order button
    Then If the user is able to click the check boxes of conditions
		

 