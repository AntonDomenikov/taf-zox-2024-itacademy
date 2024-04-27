package by.it.academy.domenikov.ui;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UiBaseTest {
    static ChromeDriver driver;
    static FluentWait<WebDriver> wait;
    @BeforeAll
    public static void openBrowser() {
        driver = new ChromeDriver();
        String url = "https://zox.la/";
        driver.manage().window().maximize();
        driver.navigate().to(url);
        wait = new WebDriverWait(driver, Duration.ofMinutes(2)).pollingEvery(Duration.ofSeconds(1));

    }
    @AfterAll
    public static void closeBrowser(){
        driver.quit();
    }

}