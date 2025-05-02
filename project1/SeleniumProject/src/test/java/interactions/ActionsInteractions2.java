package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsInteractions2 {

    @Test
    public void action1() throws InterruptedException {
        // Set the path for the ChromeDriver executable
        // Note: Ensure the provided path is correct and the driver version matches the browser version
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver (launches the Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Load the target HTML file (local file in this case)
        // Note: Update the path if the file location changes
        driver.get("file://C:\\Users\\DELL\\Desktop\\Selenium\\project1\\SeleniumProject\\src\\test\\resources\\index.html");

        // Maximize the browser window again (optional, in case the first maximize doesn't take effect properly)
        driver.manage().window().maximize();

        // Pause execution briefly to allow the page to load (not recommended for production use)
        // Consider using WebDriverWait instead of Thread.sleep for dynamic waits
        Thread.sleep(2000);

        // Create an instance of the Actions class to simulate user interactions
        Actions action = new Actions(driver);

        // Locate the button element using XPath
        // Ensure the XPath is accurate and matches the target element
        WebElement ButtonAction = driver.findElement(By.xpath("//input[@value='Trigger']"));

        // Perform a hover action on the button element
        // The moveToElement() method is used to move the cursor over the element
        action.moveToElement(ButtonAction).perform();

        // Close the browser and terminate the WebDriver session
        driver.quit();
    }
}