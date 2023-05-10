package utilities;

import org.openqa.selenium.JavascriptExecutor;

public class CommonFunctions {
	
  
	 public void scrollDown0() {
	        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
	        js.executeScript("window.scrollBy(0, 1)");
	        // Get the scroll values
	        Number scrollX = (Number) js.executeScript("return window.scrollX;");
	        Number scrollY = (Number) js.executeScript("return window.scrollY;");

	        // Print the scroll values
	        System.out.println("Sroll Down 0: ");
	        System.out.println("ScrollX: " + scrollX);
	        System.out.println("ScrollY: " + scrollY);

	    }

    public void scrollDown1() {
    	
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0,250)");
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 1: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
    
    
    public void scrollDown2() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy( 0, 500)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 2: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
    
    public void scrollDown3() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0, 750)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 3: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
    
    public  void scrollDown4() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0, 1000)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 4: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);
        
       


    }
    
    public  void scrollDown5() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0, 1235)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 5: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
    
    public  void scrollDown6() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0, 1450)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 6: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
    
    public  void scrollDown7() {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.driver;
        js.executeScript("window.scrollBy(0, 1650)");
        
        // Get the scroll values
        Number scrollX = (Number) js.executeScript("return window.scrollX;");
        Number scrollY = (Number) js.executeScript("return window.scrollY;");

        // Print the scroll values
        System.out.println("Sroll Down 7: ");
        System.out.println("ScrollX: " + scrollX);
        System.out.println("ScrollY: " + scrollY);

    }
}
