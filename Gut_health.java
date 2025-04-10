package lamdaseleniumpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gut_health {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","‪‪C:\\testdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gutcareclinics.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//To check the Book an appointment element
		driver.findElement(By.className("button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("input")).sendKeys("Test");
		WebElement element1=driver.findElement(By.id("phone-number"));
		element1.sendKeys("9999999999");
		WebElement element2=driver.findElement(By.className("c-formsubmit"));
		element2.click();
		Thread.sleep(1000);
		
		act.doubleClick().build().perform();
		Thread.sleep(2000);
		
		//To check the Book an appointment element without entering name
		driver.findElement(By.className("button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("input")).sendKeys(" ");
		WebElement element3=driver.findElement(By.id("phone-number"));
		element3.sendKeys("9999999999");
		WebElement element4=driver.findElement(By.className("c-formsubmit"));
		element4.click();
		Thread.sleep(1000);
		act.doubleClick().build().perform();
		Thread.sleep(1000);
		
		//To check the Book an appointment element without entering number
				driver.findElement(By.className("button-text")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("input")).sendKeys("test");
				WebElement element5=driver.findElement(By.id("phone-number"));
				element5.sendKeys("");
				WebElement element6=driver.findElement(By.className("c-formsubmit"));
				element6.click();
				Thread.sleep(1000);
				act.doubleClick().build().perform();
				Thread.sleep(1000);

				//To check the Book an appointment element without entering number and name
				driver.findElement(By.className("button-text")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("input")).sendKeys("");
				WebElement element8=driver.findElement(By.id("phone-number"));
				element8.sendKeys("");
				WebElement element9=driver.findElement(By.className("c-formsubmit"));
				element9.click();
				Thread.sleep(1000);
				act.doubleClick().build().perform();
				Thread.sleep(1000);

		
		//To check all the flex boxes are navigating to the respective page
		String[] flexboxes = {
			    "a.elementor-element-c83c642",
			    "a.elementor-element-85b5cba",
			    "a.elementor-element-cc74770",
			    "a.elementor-element-8d1df38",
			    "a.elementor-element-0762c88",
			    "a.elementor-element-d1886eb"
			};

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Actions actions = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			for (String selector : flexboxes) {
			    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
			    js.executeScript("arguments[0].scrollIntoView(true);", element);
			    Thread.sleep(1000);
			    actions.moveToElement(element).perform();
			    Thread.sleep(1000);
                js.executeScript("var event = new MouseEvent('mouseover', {bubbles: true}); arguments[0].dispatchEvent(event);", element);
			    element.click();
			    Thread.sleep(2000);
			    act.moveByOffset(50, 50).perform();
			    Thread.sleep(2000);
			    driver.navigate().back();
			    Thread.sleep(3000);
			}

			
		//checking the book a appointment submission form
	WebElement bookapp2=driver.findElement(By.xpath("//*[@id=\"post-4481\"]/div/div/div[6]/div/div[1]/button"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",bookapp2 );
      bookapp2.click();
      driver.findElement(By.className("input")).sendKeys("Test");
		WebElement bookapp2_values=driver.findElement(By.id("phone-number"));
		bookapp2_values.sendKeys("9999999999");
		bookapp2_values.click();
		WebElement element7=driver.findElement(By.className("c-formsubmit"));
		element7.click();
		act.doubleClick().build().perform();
		Thread.sleep(1000);
	
	//checking the browse articles navigation
	
	
	WebElement blogLink = driver.findElement(By.xpath("//*[@id=\"post-4481\"]/div/div/div[10]/div/div[2]/a"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", blogLink);
	Thread.sleep(500);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", blogLink); // JS click
	Thread.sleep(3000);
	act.moveByOffset(50, 50).perform();
	Thread.sleep(1000);
	driver.navigate().back();
	 try {
         org.openqa.selenium.Alert alert = driver.switchTo().alert();
        
         alert.dismiss();  // or alert.accept();
     } catch (NoAlertPresentException nae) {
      
     }
	 Thread.sleep(3000);
	
	 //checking the navigation of quick updates
	List<WebElement> cards = driver.findElements(By.cssSelector("article.entry-card"));

	for (int i = 0; i < 3; i++) {
	    cards = driver.findElements(By.cssSelector("article.entry-card"));
	    WebElement card = cards.get(i);
	    WebElement link = card.findElement(By.tagName("a"));

	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", card);
	    Thread.sleep(1000);
        act.moveToElement(card).perform();
	    Thread.sleep(1000);
	    String script = "var event = new MouseEvent('mouseover', {bubbles: true}); arguments[0].dispatchEvent(event);";
	    ((JavascriptExecutor) driver).executeScript(script, card);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
	    
	    Thread.sleep(2000);
	    act.moveByOffset(50, 50).perform();
	    Thread.sleep(2000);
	    //driver.navigate().back();
	    driver.get("https://www.gutcareclinics.com/");
	    Thread.sleep(3000);
	}


		
		// Define all social media icon XPaths
		String parentWindow = driver.getWindowHandle();

		Thread.sleep(2000);
		String[] socialMediaselector = {
			    "a.elementor-repeater-item-4c94c0d",  // Facebook
			    "a.elementor-repeater-item-8a69652",  // Twitter
			    "a.elementor-repeater-item-c5da060",  // LinkedIn
			    "a.elementor-repeater-item-80df918"   // Instagram (example)
			};

			for (String cselector : socialMediaselector) {
			    WebElement link = driver.findElement(By.cssSelector(cselector));

			    // Scroll and hover
			    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
			    Thread.sleep(500);
			    actions.moveToElement(link).perform(); // simple hover
			    Thread.sleep(500);
			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
			    Thread.sleep(2000);
			    Set<String> allWindows = driver.getWindowHandles();
			    for (String window : allWindows) {
			        if (!window.equals(parentWindow)) {
			            driver.switchTo().window(window);
			            System.out.println("Switched to: " + driver.getTitle());
			            Thread.sleep(2000);
			            driver.close();
			            driver.switchTo().window(parentWindow);
			        }
			        Thread.sleep(1500);
		}

			}
			 Thread.sleep(2000);
	  //Checking the footer doctors,faqs,treatments
	   
	    String[] footer = {
	    	    "#menu-1-7c67d51 > li:nth-child(1) > a:nth-child(1)",
	    	    "#menu-1-7c67d51 > li:nth-child(2) > a:nth-child(1)",
	    	    "#menu-1-7c67d51 > li:nth-child(3) > a:nth-child(1)"
	    	};

	    	for (String footer3 : footer) {
	    	    WebElement elements3 = driver.findElement(By.cssSelector(footer3));
	    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements3);
	    	    Thread.sleep(500);
	    	    actions.moveToElement(elements3).perform();
	    	    Thread.sleep(500);
	    	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements3);
	    	    Thread.sleep(2000);
	    	    driver.navigate().back();
	    	    Thread.sleep(2000);
	    	}

		//sm footer
		String[] sm_footer = {
				 "a.elementor-repeater-item-993ef04",
			     "a.elementor-repeater-item-a229ff5",
			     "a.elementor-repeater-item-a1c64d4",
			     "a.elementor-repeater-item-ddbcb23"
				};

				for (String csselector: sm_footer) {
				    WebElement link = driver.findElement(By.cssSelector(csselector));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
				    Thread.sleep(2000);
				    Set<String> allWindows = driver.getWindowHandles();
				    for (String window : allWindows) {
				        if (!window.equals(parentWindow)) {
				            driver.switchTo().window(window);
				            System.out.println("Switched to: " + driver.getTitle());
				            Thread.sleep(2000);
				            driver.close();
				            driver.switchTo().window(parentWindow);
				        }
				    }
				    Thread.sleep(1500);
				}	
		
		
}

}