package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import runner.TestRunner;


import java.net.MalformedURLException;

public class HomePage extends TestRunner {


    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";

    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }

}