package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.EssenceEcommWebElements;
import utilities.DriversInit;


public class EssenceEcommJuTest {
	
	EssenceEcommWebElements eew = new EssenceEcommWebElements(DriversInit.getDriver());
	

	@Given("open Essence Ecomm WebApp.")
	public void open_essence_ecomm_web_app() {
		
		String curUrl=DriversInit.driver.getCurrentUrl();
		System.out.println("Current Url is:  "+curUrl);
		
	}
	

	@Then("hover on pages and click home")
	public void hover_on_pages_and_click_home() {
		eew.hoverPages();
		eew.clickOnHome();
	}
	
	
	@Then("hover on pages and click contact")
	public void hover_on_pages_and_click_contact() {
	   
		eew.hoverPages();
		eew.selectContact();
	}
	

	@Then("accept the alerts")
	public void accept_the_alerts() {

		eew.alertss();
	}
	
	@Then("Hover on shop and click Dresses")
	public void hover_on_shop_and_click_dresses() {

		eew.shopAndSelectDresses();
	}
	
	
	@Then("select a dress")
	public void select_a_dress() {
	    System.out.println("Dresses Selected.");
	}
	
	@Then("If the user is able to click on the Add to Cart button")
	public void if_the_user_is_able_to_click_on_the_add_to_cart_button() {
	  
		eew.cart();
	}
	
	
	@Then("If the user is able to click on the Checkout button")
	public void if_the_user_is_able_to_click_on_the_checkout_button() {
	    
		eew.clickChekout();
	}
	
	
	@Then("If the user is able to add all required details in the Billing Address page")
	public void if_the_user_is_able_to_add_all_required_details_in_the_billing_address_page() {
		
		eew.billingAddress();
	}
	

	@Then("If the user is able to click on the Place Order button")
	public void if_the_user_is_able_to_click_on_the_place_order_button() throws InterruptedException {
	    
		eew.placeOrder();
	}
	
	
	@Then("If the user is able to click the check boxes of conditions")
	public void if_the_user_is_able_to_click_the_check_boxes_of_conditions() throws InterruptedException {
	    
		eew.conditions();
		DriversInit.quitDriver();
	}
	
	
}
