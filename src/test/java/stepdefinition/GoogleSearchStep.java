package stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchStep {

//    WebDriver webDriver = null;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step : browser is open");
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project Path : " + projectPath);
//        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        //webDriver.manage().window().maximize();
//    }
//
//    @And("user is on google search page")
//    public void user_is_on_google_search_page() {
//        System.out.println("Inside Step : user is on google search page");
//        webDriver.navigate().to("http://google.com");
//    }
//
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() throws InterruptedException {
//        System.out.println("Inside Step : user enters a text in search box");
//        webDriver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//        Thread.sleep(2000);
//    }
//
//    @And("hits enter")
//    public void hits_enter() throws InterruptedException {
//        System.out.println("Inside Step : user hits enter");
//        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to search result")
//    public void user_is_navigated_to_search_result() {
//        System.out.println("Inside Step : user is navigated to search result");
//        webDriver.getPageSource().contains("Online Courses");
//
//        webDriver.close();
//        webDriver.quit();
//    }

}
