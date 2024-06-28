package AmazonTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");     // to Navigate Home page
		//To select Search tab and enter product name

		WebElement SearchTab = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		SearchTab.sendKeys("iphone");

		SearchTab.submit();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  //click on search button

	

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,950)");              // To Scroll Down

		Thread.sleep(2000);

		

		// To select product and change the color

		//driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-declarative']//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-include-content-margin puis puis-venwvwvlyajf42i40ha3krloiy s-latency-cf-section puis-card-border']//div[@class='a-section']//div[@class='puisg-row']//div[@class='puisg-col puisg-col-4-of-12 puisg-col-8-of-16 puisg-col-12-of-20 puisg-col-12-of-24 puis-list-col-right']//div[@class='puisg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='puisg-row']//div[@class='puisg-col puisg-col-4-of-12 puisg-col-4-of-16 puisg-col-4-of-20 puisg-col-4-of-24']//div[@class='puisg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']//div[@class='a-section s-color-swatch-outer-circle s-color-swatch-pad']//div//a[@aria-label='Blue']//span[@class='s-color-swatch-inner-circle-border']")).click();  // To Change color

		

		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']//img[@alt='Apple iPhone 13 (128GB) - Starlight']")).click(); //To Select product

		js.executeScript("window.scrollBy(0,350)");

		//driver.findElement(By.xpath("//img[@alt='Blue']")).click();  // To Change color

		

		// To select Add to Card and click on

		driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();

					

		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click(); // click on Cart

		

		// to select quantity

		Select Quantity = new Select(driver.findElement(By.id("a-autoid-0-announce")));

		Quantity.selectByValue("1");

		

		// to proceed to buy

		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();

		

		// to create account in sign page

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vaishalikharpude@gmail.com");

		driver.findElement(By.xpath("//input[@id='continue']")).click();

		

		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9850933506");        // to enter mobile no

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Vaishali Kharpude");  //to enter name

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Vaishu@12");         //to  enter password 

		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();                            // click on verify button

		

	}

	


}
