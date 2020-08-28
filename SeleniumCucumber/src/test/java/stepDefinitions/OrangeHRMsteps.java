package stepDefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {

    WebDriver driver;

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Ashan//IdeaProjects//SeleniumCucumber//Drivers//chromedriver.exe");
        driver = new ChromeDriver();


    }

    @When("User opens URL {string}")
    public void user_opens_url(String ul) {

        driver.get(ul);

    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String un, String pd) {

        driver.findElement(By.name("txtUsername")).sendKeys(un);
        driver.findElement(By.name("txtPassword")).sendKeys(pd);
    }

    @When("Click on Login")
    public void click_on_login() {

        driver.findElement(By.name("Submit")).click();

    }

    @Then("Page url should be {string}")
    public void page_url_should_be(String Eurl) {

        String Turl = driver.getCurrentUrl();


        Assert.assertEquals(Eurl,Turl);

    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='welcome']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();

    }

    @Then("Final page url should be {string}")
    public void Final_page_url_should_be( String FEurl) {

        String FTurl = driver.getCurrentUrl();
        Assert.assertEquals(FEurl,FTurl);

    }

    @Then("close browser")
    public void close_browser() {

        driver.close();


    }


}
