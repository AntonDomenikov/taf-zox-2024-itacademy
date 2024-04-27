package by.it.academy.domenikov.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SiteTest extends UiBaseTest {
    @Test
    @DisplayName("2.User successfully logged in and added item to the cart.")
    public void loginItemCart() {
        driver.findElement(By.xpath(SignUpLocators.SIGNUP_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)));
        driver.findElement(By.cssSelector(SignInLocators.LOGIN_EMAIL_FIELD_CSS_SELECTOR)).sendKeys(SignInLocators.TEST_LOGIN_EMAIL1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_PASSWORD_FIELD_XPATH)).sendKeys(SignInLocators.TEST_LOGIN_PASSWORD1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH))).click();
        driver.findElement(By.xpath(SignInLocators.SEARCH_FIELD_XPATH)).sendKeys("Butterfly Kisses");

    }
}