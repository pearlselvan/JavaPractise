package SeleniumCode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by muthuselvan on 6/22/17.
 */
public class ChromeAuto  {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muthuselvan/Downloads/chromedriver");
//        System.setProperty("webdriver.firefox.marionette","/Users/muthuselvan/Downloads/geckodriver");
        // Initialize browser
        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts();
//        driver.wait(100);
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://secure2.store.apple.com/shop/sign_in?c=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3wxYW9zZTQyMmM4Y2NkMTc4NWJhN2U2ZDI2NWFmYWU3NWI4YTJhZGIyYzAwZQ&r=SCDHYHP7CY4H9XK2H&s=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3wxYW9zZTQyMmM4Y2NkMTc4NWJhN2U2ZDI2NWFmYWU3NWI4YTJhZGIyYzAwZQ");
      //  Thread.sleep(100);
        try {
            System.out.println("Finding element");
            System.out.println("Title" +driver.getTitle());
            System.out.println("Wait plase ");
            System.out.println("Waiting for link");

//            Thread.sleep(5000);
//            System.out.println("Page " +driver.getPageSource());

            WebElement webElement = driver.findElement(By.name("login-appleId")) ;

            webElement.sendKeys("pearl.selvan");


            Alert alt = driver.switchTo().alert();



//            driver.findElement(By.name("login-appleId")).sendKeys("pearl.selvan@gmail.com");

//            driver.findElement(By.name("login-password")).sendKeys("pearl.selvan@gmail.com");

//            driver.findElement(By.id("sign-in")).click();



//            Thread.sleep(5000);
//            WebElement webElement = driver.findElement(By.tagName("input"));
//            System.out.println("WE" +webElement.getAttribute("id"));

//            driver.findElement(By.xpath("input#pwd.si-password.si-text-field.form-textbox")).sendKeys("welvom");

//            String Script = "javascript:document.getElementById('appleId').click();";

//            ((JavascriptExecutor) driver).executeScript(Script);
//            webElement.findElement(By.id("appleId")).sendKeys("wr");
            Thread.sleep(10000);



        } catch (NoSuchElementException e) {
    }
        ///html/body/div/apple-auth/div/div[1]/div/sign-in/div/div[1]/div[5]/input
        driver.close();
        driver.quit();


    }
}
