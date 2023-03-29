package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

public class ClockScenario {
    private WebDriver driver;

    public ClockScenario(){
        this.driver = Hook.getDriver();
    }

    @Given("^I open the clock$")
    public void i_open_the_clock() throws Throwable {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]")).click();
        Thread.sleep(5000);
    }

    @When("^I set alarm$")
    public void i_set_alarm() throws Throwable {
        driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/pm_label")).click();
        driver.findElement(By.id("android:id/button1")).click();
        Thread.sleep(2000);
    }

    @Then("^I validate the alarm$")
    public  void i_validate_the_alarm() throws Throwable {
        Thread.sleep(5000);
    }
}
