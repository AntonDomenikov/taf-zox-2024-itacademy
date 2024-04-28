package by.it.academy.domenikov.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInTest extends UiBaseTest {
    @Test
    @DisplayName("SignIn: 1.User successfully logged in")
    public void loginItemCart() {
        driver.findElement(By.xpath(SignUpLocators.SIGNUP_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)));
        driver.findElement(By.cssSelector(SignInLocators.LOGIN_EMAIL_FIELD_CSS_SELECTOR)).sendKeys(SignInLocators.TEST_LOGIN_EMAIL1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_PASSWORD_FIELD_XPATH)).sendKeys(SignInLocators.TEST_LOGIN_PASSWORD1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)).click();
        Assertions.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.ACCOUNT_DETAILS_TEXT_XPATH))).getText(), "Account Details");
    }
    @Test
    @DisplayName("SignIn: 2. Empty email field validation")
    public void SignInEmptyEmailValidation(){
        driver.findElement(By.xpath(SignUpLocators.SIGNUP_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)));
        driver.findElement(By.xpath(SignInLocators.LOGIN_PASSWORD_FIELD_XPATH)).sendKeys(SignInLocators.TEST_LOGIN_PASSWORD1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)).click();
        Assertions.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.SIGNUP_SIGNIN_EMAIL_PASSWORD_VALIDATION_MESSAGE))).getText(), "Please provide both an email and a password.");

    }
    @Test
    @DisplayName("SignIn: 3. Empty password field validation")
    public void SignInEmptyPasswordValidation(){
        driver.findElement(By.xpath(SignUpLocators.SIGNUP_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)));
        driver.findElement(By.cssSelector(SignInLocators.LOGIN_EMAIL_FIELD_CSS_SELECTOR)).sendKeys(SignInLocators.TEST_LOGIN_EMAIL1);
        driver.findElement(By.xpath(SignInLocators.LOGIN_BUTTON_XPATH)).click();
        Assertions.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.SIGNUP_SIGNIN_EMAIL_PASSWORD_VALIDATION_MESSAGE))).getText(), "Please provide both an email and a password.");

    }
}