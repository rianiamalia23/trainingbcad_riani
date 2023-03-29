package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.awt.event.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.android.*;
import org.testng.Assert;
import utility.Hook;

public class ChromeMobilScenario {
    private WebDriver driver;

    public ChromeMobilScenario(){
        this.driver = Hook.getDriver();
    }

    @Given("^I hit search box$")
    public void i_hit_search_box() throws Throwable {
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());
    }

    @When("^I type the keyword$")
    public void i_type_the_keyword() throws Throwable {
        driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("appium");
        //driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        //driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    @Then("^I validate the search result$")
    public  void i_validate_the_search_result() throws Throwable {
        //driver.findElement(By.xpath(""));
    }
}
