package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
@Before
public void fit(){

driver = new ChromeDriver();
driver.manage().window().maximize();

    }
    @After
    public void pm() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.close();

    }


}
