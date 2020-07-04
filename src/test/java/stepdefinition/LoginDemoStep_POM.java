package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoStep_POM {

//    WebDriver webDriver = null;
//    LoginPage loginPage = null;
//
////     public LoginDemoStep_POM(WebDriver driver){
////         this.driver = driver;
////     }
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("=========== I am inside LoginDemoStep_POM ==============");
//
//        System.out.println("Inside Step : browser is open");
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project Path : " + projectPath);
//        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        //webDriver.manage().window().maximize();
//
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//
//        webDriver.navigate().to("https://example.testproject.io/web/");
//
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username , String password) throws InterruptedException {
//        loginPage = new LoginPage(webDriver);
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(password);
//        //webDriver.findElement(By.id("name")).sendKeys(username);
//        //webDriver.findElement(By.id("password")).sendKeys(password);
//
//        Thread.sleep(3000);
//
//    }
//
//    @And("user clicks on login")
//    public void user_clicks_on_login() {
//        loginPage.clickLogin();
//        //webDriver.findElement(By.id("login")).click();
//
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() throws InterruptedException {
//        //webDriver.findElement(By.id("logout")).isDisplayed();
//        loginPage.checkLogOutIsDisplayed();
//
//        Thread.sleep(3000);
//
//        webDriver.close();
//        webDriver.quit();
//    }

}
