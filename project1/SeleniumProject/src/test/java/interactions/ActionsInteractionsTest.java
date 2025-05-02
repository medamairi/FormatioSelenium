package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsInteractionsTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:/C:\\Users\\DELL\\Desktop\\Selenium\\project1\\SeleniumProject\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testContextClick() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement buttonAction = driver.findElement(By.xpath("//input[@value='Click me']"));
        action.contextClick(buttonAction).perform();
        Thread.sleep(2000); // Use explicit waits instead in real tests
    }

    @Test
    public void testDoubleClick() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement buttonAction = driver.findElement(By.xpath("//input[@value='Click me']"));
        action.doubleClick(buttonAction).perform();
        Thread.sleep(2000); // Use explicit waits instead in real tests
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}