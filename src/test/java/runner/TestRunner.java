package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    public static WebDriver driver;
    public static ChromeOptions options;
    public static EdgeOptions options1;

    @BeforeTest(alwaysRun = true)
    @Parameters("browserType")
    public static void setup(String browser) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("firefox")){

            capabilities.setBrowserName("firefox");
        }
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){

            capabilities.setBrowserName("chrome");

            options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
        }
        //Check if parameter passed as 'Edge'
        else if(browser.equalsIgnoreCase("Edge")){
            capabilities.setBrowserName("MicrosoftEdge");

            options1 = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
        }
        else{
            //If no browser passed throw exception
         //   throw new Exception("Browser is not correct");
        }
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        //    this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);

    }

    @Test()
    public void features() throws Throwable {
        HomePage.click_hamburger_menu();
    }


}