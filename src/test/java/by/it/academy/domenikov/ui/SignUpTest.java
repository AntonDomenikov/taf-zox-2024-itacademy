package by.it.academy.domenikov.ui;

import by.it.academy.domenikov.utils.CustomRandomEmailGenerator;
import by.it.academy.domenikov.utils.CustomRandomPasswordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpTest extends UiBaseTest {
    @Test
    @DisplayName("SignUP: 1.The user has successfully registered and logged out")
    public void successfullSignUpFlow() {
        driver.findElement(By.xpath(SignUpLocators.SIGNUP_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.CREATE_NEW_ACCOUNT_LINK_XPATH))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.CREATE_ACCOUNT_BUTTON_XPATH)));
        driver.findElement(By.cssSelector(SignUpLocators.REGISTER_PASSWORD_FIELD_CSS_SELECTOR)).sendKeys(CustomRandomPasswordGenerator.generateRandomPassword(8));
        driver.findElement(By.cssSelector(SignUpLocators.REGISTER_EMAIL_FIELD_CSS_SELECTOR)).sendKeys(CustomRandomEmailGenerator.generateRandomEmail());
        driver.findElement(By.xpath(SignUpLocators.CREATE_ACCOUNT_BUTTON_XPATH)).click();
        String actualResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignUpLocators.ACCOUNT_DETAILS_TEXT_XPATH))).getText();
        Assertions.assertEquals(actualResult, "Account Details");
        driver.findElement(By.xpath(SiteLocators.SIGNOUT_BTN_XPATH)).click();

    }
    @Test
    @DisplayName("SignUP: 2. Empty email field validation")
    public void emptyEmailValidation(){

    }
    @Test
    @DisplayName("SignUP: 3. Empty password field validation")
    public void emptyPasswordValidation(){

    }
}