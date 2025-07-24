package Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class p03_Delete_book {
    SoftAssert soft = new SoftAssert();

    @Given("the user is logged in and has a product in his cart")

    public void loginWithBook() throws InterruptedException {

        Hooks.driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);


    }

    @When("the user navigates to cart")
    public void goToProfile() throws InterruptedException {
        Hooks.driver.findElement(By.id("shopping_cart_container"));
        Thread.sleep(1000);
    }

    @And("deletes the product")
    public void deleteBook() throws InterruptedException {
         Hooks.driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);

    }

    @Then("the product should be removed from the cart")
    public void verifyBookRemoved() throws InterruptedException {
        Thread.sleep(1000);
       soft.assertTrue(Hooks.driver.findElement(By.id("cart_contents_container")).isDisplayed());
    }
}
