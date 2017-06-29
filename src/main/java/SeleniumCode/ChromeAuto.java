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
        // Initialize browser
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.icloud.com/");
        driver.navigate().to("https://www.icloud.com/");
        Thread.sleep(100);
//        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);

//        driver.findElement(By.className("img")).click()]

        try {
            System.out.println("Finding element");
//            Thread.sleep(5000);
            System.out.println("Title" +driver.getTitle());


//            Thread.sleep(5000);
            System.out.println("Wait plase ");

//            driver.findElement(By.tagName("input")).findElement(By.id("remember-me")).click();


//            driver.findElement(By.name("submit")).sendKeys(Keys.RETURN);
//            driver.findElement(By.id("remember-me-label")).click();

//            driver.findElement(By.ById.id("icloud-lite-notice-link")).click();
//            driver.findElement(By.id("icloud-lite-notice-link")).click();
//            driver.findElement(By.cssSelector("input#remember-me.form-choice.form-choice-checkbox")).click();
            System.out.println("Waiting for link");

            //webdriver.executeScript("document.getElementById('elementID').setAttribute('value', 'new value for element')");


            Thread.sleep(3000);

            driver.manage().window().maximize();

//            List element = driver.findElements(By.tagName("input"));
//
//           for (int i=0;i<element.size();i++) {
//               System.out.println(element.get(i).toString());
//           }

            WebElement webElement = driver.findElement(By.tagName("input"));
//            driver.findElement(By.id("pwd")).sendKeys("er");

            webElement.findElement(By.id("pwd")).sendKeys("wr");


//            driver.switchTo();


//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("document.getElementById('appleId').setAttribute('value', 'pearl.selvan@gmail.com')");

        } catch (NoSuchElementException e) {


    }
        ///html/body/div/apple-auth/div/div[1]/div/sign-in/div/div[1]/div[5]/input
        driver.close();
        driver.quit();


    }
}
