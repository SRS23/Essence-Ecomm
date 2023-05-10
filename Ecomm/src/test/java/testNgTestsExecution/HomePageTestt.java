package testNgTestsExecution;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.EssenceEcommLocatorss;
import utilities.DriverInit;
import utilities.Reportss;


public class HomePageTestt extends Reportss  {

	EssenceEcommLocatorss ecom = new EssenceEcommLocatorss(DriverInit.openBrowser());
	
	
	
	@BeforeTest
	public void openUrl() {
		reportConfig();
		DriverInit.openBrowser();
		String curUrl=DriverInit.driver.getCurrentUrl();
		System.out.println("Current Url is:  "+curUrl);
	}
	
	@Test(priority=-1)
	public void hoverOnPages() {
		
		createTest("Hover On Pages Option. ");
		ecom.hoverPages();
	}
	@Test(priority=1)
	public void clickHome() {
		
		createTest("Click On Home. ");
		ecom.clickOnHome();
	}
	
	@Test(priority=2)
	public void clickContact() {
		
		createTest("Hover on Pages Option and click on contact. ");
		ecom.hoverPages();
		ecom.selectContact();
	}
	
	@Test(priority=3)
	public void acceptAlert() {
		
		createTest("accept the alert. ");
		ecom.alertss();
	}
	
	@Test(priority=4)
	public void accepgeoLocation() {
		
		createTest("Click ok for geo location.");
		ecom.geoLocationOk();
	}
	
	@Test(priority=5)
	public void subscribeEssence() {
		
		createTest("Enter Email to subscribe for Essence Ecomm. ");
		ecom.enterMail();
	}
	
	@Test(priority=6)
	public void hoverOnShopSelectDresses() {
		
		createTest(" Hover on Shop Option and click on Dresses. ");
		ecom.shopAndSelectDresses();
	}
	
	@Test(priority=7)
	public void selectAproductAndClickAddToCart() {
		
		createTest("select a product and add it to cart. ");
		ecom.cart();
	}
	
	@Test(priority=8)
	public void goToCheckout() {
		
		createTest("Navigate to checkout. ");
		ecom.clickChekout();
	}
	
	@Test(priority=9)
	public void enterBillingAddressDetails() {
		
		createTest("Enter details for Billing Address. ");
		ecom.billingAddress();
		
	}
	
	@Test(priority=10)
	public void selectPayment() {
		
		createTest("Check different payment options. ");
		ecom.selectPayments();
		
	}
	
	@Test(priority=11)
	public void clickOnPlaceOrder()  {

		createTest("Click Place order. ");
		ecom.placeOrder();
		
	}
	
	@Test(priority=12)
	public void acceptConditions()  {
		
		createTest("Accept the conditions. ");
		ecom.placeOrder();
		
	}
	
	@Test(priority=13)
	public void checkboxesConditions() {
		
		createTest("Checkboxes are enabled and selected. ");
		ecom.conditions();
	}
	
	@AfterTest
	public void quitBrowser() {
		
		flush();
		DriverInit.closeBrowser();
	}
	
	
}
