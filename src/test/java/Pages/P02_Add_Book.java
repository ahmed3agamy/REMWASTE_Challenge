package Pages;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

public class P02_Add_Book {
    SoftAssert soft = new SoftAssert();

    @Given("the user is logged into the Store")
    public void login() throws InterruptedException {
        Hooks.driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
    }

    @When("the user add Sauce Labs Backpack to the cart")
    public void selectBook() {
        Hooks.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

    }

    @Then("verify that the product is added")
    public void verifyBookAdded() {

        soft.assertTrue(Hooks.driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed());
    }
}



