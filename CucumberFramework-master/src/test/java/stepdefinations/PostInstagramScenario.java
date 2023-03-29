package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;

public class PostInstagramScenario {
    private WebDriver driver;

    public PostInstagramScenario() {
        this.driver = Hook.getDriver();
    }

    @Given("^I access the instagram account$")
    public void i_access_the_instagram_account(){
        driver.get("https://www.instagram.com/");

    }
    @When("^I input username$")
    public void i_input_username(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trialbcad");
    }

    @When("^I input password$")
    public void i_input_password() {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@29Maret2023");
    }

    @When("^I login instagram$")
    public void i_login_instagram() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("^I hit button create post$")
    public void i_hit_button_create_post(){
        driver.findElement(By.xpath("//div[@role='button']")).click();
    }

    @When("^I click the button post$")
    public void i_click_the_button_post(){
        driver.findElement(By.xpath("//div[@class='_aacl _aacp _aacu _aacx _aada'][normalize-space()='Create']")).click();
        //driver.findElement(By.xpath("//button[normalize-space()='Select from computer']")).click();
        //driver.findElement(By.xpath("//input[@type='file']"));
        //WebElement chooseFile = driver.findElement(By.id("custom-input"));
        //chooseFile.sendKeys("C:\\Users\\riani.amalia\\Downloads\\mpus.jpg");
        WebElement chooseFile = driver.findElement(By.xpath("//div[@class='x1n2onr6 x78zum5 x5yr21d xl56j7k x6s0dn4 xh8yej3']//input[@type='file']"));
        chooseFile.sendKeys(System.getProperty("user.dir")+"//drivers//mpus.jpg");
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//div[@aria-label='Write a caption...']")).sendKeys("Training BCA Digital SQA 2023 - Riani Amalia");
        driver.findElement(By.xpath("//div[contains(text(),'Share')]")).click();
    }
    @Then("^I validate photo on feed$")
    public void i_validate_photo_on_feed(){
        //driver.findElement(By.xpath("//div[@class='_aacl _aacp _adda _aacx _aada']")).click();
        //driver.findElement(By.xpath("//*[name()='polyline' and contains(@fill,'none')]")).click();
        //driver.findElement(By.xpath("<img alt=\"Foto profil liona_yona\" class=\"x6umtig x1b1mbwd xaqea5y xav7gou xk390pu x5yr21d xpdipgo xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x11njtxf xh8yej3\" crossorigin=\"anonymous\" draggable=\"false\" src=\"https://scontent-cgk1-2.cdninstagram.com/v/t51.2885-19/67146733_388687898450696_5877680487085899776_n.jpg?stp=dst-jpg_s150x150&amp;_nc_ht=scontent-cgk1-2.cdninstagram.com&amp;_nc_cat=108&amp;_nc_ohc=nO4eAa9AWegAX-qnc_c&amp;edm=ACWDqb8BAAAA&amp;ccb=7-5&amp;oh=00_AfDYBzCK_JdsSCenQkCMtMEmy7tB475DBBKQrRd3XXHjig&amp;oe=6428B1CF&amp;_nc_sid=1527a3\">")).click();
    }

}
