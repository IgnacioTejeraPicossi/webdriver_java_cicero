
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class SimpleWebTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeEach
    public void initWebDriver(){
        driver = new ChromeDriver();
       // wait =  new WebDriverWait(driver, 30);
    }
    @Test
    public void searchDuckDuckGo(){
        //load the page
        driver.get("https://duckduckgo.com/");

        //Enter search phrase
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("giant panda");

        //Click search button
        WebElement searchButton = driver.findElement(By.className("searchbox_searchButton__F5Bwq iconButton_button__6x_9C"));
        searchButton.click();

        //Wait for result to appear
        wait.until(ExpectedConditions.titleContains("giant panda"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("r1-0")));

        //Make sure each result contains the word "panda"
        List<WebElement> resultLinks = driver.findElements(By.id("r1-0"));
        for (WebElement link : resultLinks){
            assertTrue(link.getText().matches("(?i).*panda*"));
        }
    }
    @AfterEach
    public void quitWebDriver(){
        driver.quit();
    }
}
