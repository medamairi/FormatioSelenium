package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsInteractions3 {
    @Test
    public void Action3() throws InterruptedException {
        // Set the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome browser (WebDriver instance)
        WebDriver driver = new ChromeDriver();

        // Navigate to the target HTML file (UI test page)
        driver.get("file://C:\\Users\\DELL\\Desktop\\Selenium\\project1\\SeleniumProject\\src\\test\\resources\\index.html");

        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Pause execution briefly to allow the webpage to load properly
        Thread.sleep(2000);

        // Create an instance of the Actions class to perform advanced user interactions
        Actions action = new Actions(driver);

        // Locate the source element (draggable object) by its ID
        WebElement source = driver.findElement(By.id("draggable-1"));

        // Locate the target element (drop zone) by its class name
        WebElement destination = driver.findElement(By.className("example-dropzone"));

        // Uncomment the following line if you want to use the direct dragAndDrop() method
        // action.dragAndDrop(source, destination).perform();

        // Use clickAndHold() to hold the source element, move it to the destination, and release it
        action.clickAndHold(source).moveToElement(destination).release().perform();

        // Close the browser and quit the WebDriver instance
        driver.quit();
    }
}