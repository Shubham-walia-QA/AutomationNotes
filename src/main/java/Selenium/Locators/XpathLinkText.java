package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathLinkText {

    /*
    Link Text - If any element start with a tag then it is a link.

    Xpath -

    1. //tagName[@attribute='value']
    2. //tagName[@attribute='value'][IndexNumber]
    3. //tagName[contains(@attribute,'value')]
    4. //tagName
    5. parentXpath ChildXpath :: Find normal xpath of parent and child just add space in between.
      .clear() - Will clear the entered text in the input box.

    Note :- 1. Sometimes the element may not pick on entering the value by index. This could be due to hidden attribute. In
             css it will ignore that hidden attribute but in xpath it will count that hidden attribute.
            2. Finding attribute using index is not recommended.
            3. We will get element intercepted error msg when the application is in changing state.
            4. In xpath the class name having blank space should be written completely. like By.className we cannot write
             single class.

    Practice : -
    Old - (IdName)
    1. Open https://rahulshettyacademy.com/locatorspractice.
    2. find id and enter username rahul.
    3. find name and  enter pwd hello123.
    4. Find class name of the sign In button and do click.
    Old -  (CssSelector)
    5. Capture the incorrect username or pwd error msg and display it in output. use css Selector.
    Old - (wait)
    6. Apply implicit wait statement to stop the testcase failing till the above error msg is not loaded.
    New - 38
    7. find LinkText of forgot your password? button and click.
    8. Find xpath of userName and enter john in name input box.
    9. Find cssSelector of email input box and enter john@rsa.
    10. Find xpath having index of email input box and clear input box.
    11. Find cssSelector having index of email input box and enter john@gmail.com.
    12. Find xpath having index of phone number input box and enter phone number.
    13. Find cssSelector of reset login and perform click action.
    14. Find cssSelector of please use temporary password error msg and perform get text.

    Note :-1.  on clicking the forgot your password button in step 7 the page is sliding from left to right. This animation
    will take time and during that time it will try to search element error.

    New - 39
    15. add 1000 ms sleep before step 8.
    16. Find xpath of child relation of forgot pwd button and perform click action.
    17. Find CssSelector using id of username and enter rahul text.
    18. Find cssSelector using attribute value pass not inputPassword and enter rahulShettyacademy
    19. find id of checkbox and perform click.
    20. Find xpath using contains in Submit button and perform click.

     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("hello123");

        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);//

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
