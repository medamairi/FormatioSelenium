package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class clickSelenium {
    @Test
    public void Click () {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        //Thread.sleep(4000);

        driver.findElement(By.id("login-button")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //driver.findElement(By.xpath("//*[@id='login-button']")).click();
        driver.quit();
    }
}
