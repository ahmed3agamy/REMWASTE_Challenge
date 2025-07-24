package Pages;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class P01_Login {
    SoftAssert soft = new SoftAssert();

    @Given("user is on the login page")
    public void UserIsOnTheLoginPage() throws InterruptedException {
        Hooks.driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
    }

    @When("write valid User Name and password")
    public void ValidLogin() throws InterruptedException {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

    }
    @When("write invalid User Name")
    public void InvalidUserNameLogin() throws InterruptedException {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("agamy123");
        Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

    }
    @When("write invalid password")
    public void InvalidPasswordLogin() throws InterruptedException {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // password without spatial char
        Hooks.driver.findElement(By.id("password")).sendKeys("Test1234");
        Thread.sleep(2000);

    }
    @When("write empty User Name and password")
    public void EmptyLogin() throws InterruptedException {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("");
        Hooks.driver.findElement(By.id("password")).sendKeys("");
        Thread.sleep(2000);

    }

    @And("click on login button")
    public void login_Button() throws InterruptedException {
        Hooks.driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }
    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() throws InterruptedException {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"));

    }
    @Then("user should see Error message")
    public void userShouldSeeErrorMeassage() throws InterruptedException {
        Thread.sleep(2000);
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("button[class=\"error-button\"]")).isDisplayed());


    }


}




