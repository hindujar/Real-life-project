package reallifeproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fictionbooks{
	 
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.bookswagon.com/");
        // Initialize the WebDriver
       // WebDriver driver1 = new ChromeDriver();

  

        // Navigate to the BooksWagon URL
		
		Thread.sleep(3000);
       

        try {
            // Close the login popup if it appears
            WebElement closePopupButton = driver1.findElement(By.id("wzrk-cancel"));
            if (closePopupButton.isDisplayed()) {
                closePopupButton.click();
            }

            // Click on the "Best Sellers" link
            WebElement bestSellersLink = driver1.findElement(By.xpath("//*[@id=\"ctl00_libestseller\"]/a"));
            bestSellersLink.click();

            // Wait for the list of best sellers to be visible
           

            // Select the first best-seller book from the list
            WebElement firstBestSellerBook = driver1.findElement(By.xpath("//*[@id=\"listpromoproduct\"]/div[1]/div/span"));
            firstBestSellerBook.click();

            // You can add additional code here to perform actions on the selected best-seller book.

            // Sleep for a few seconds to see the result (you should use WebDriverWait in a production environment)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver1.quit();
        }
    }
}
