import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void testGoogleSearch() {
        // Configurer le chemin vers ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Initialiser WebDriver
        WebDriver driver = new ChromeDriver();

        // Ouvrir Google
        driver.get("https://www.google.com");

        // Vérifier le titre de la page
        System.out.println("Titre de la page: " + driver.getTitle());

        // Fermer le navigateur
        driver.quit();
    }
}
