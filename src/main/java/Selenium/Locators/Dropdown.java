//package Selenium.Locators;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.time.Duration;
//import java.util.List;
//
//public class Dropdown {
//
//    /*
//    DropDown :: It starts with a select tag. And have option tag inside it.
//
//    Note :: There is another category of dropdown which doesn't have select tag for them, we will use normal element name and send keys.
//
//    Note :: to open new tab
//    driver.switchTo().newWindow(WindowType.TAB);
//
//    * For dropdowns with select tag, first fetch the web element info and store it in a variable.
//        WebElement elements = driver.findElement(By.id("searchLanguage"));
//
//    * Create object of Select class.
//        Select select = new Select(elements);
//
//    * Select any element using
//        1. Value.
//        2. Visible Text.
//        3. Index.
//
//
//    Steps:
//    1. Open Chrome browser.
//    2. Open url :: https://way2automation.com/way2auto_jquery/index.php
//    3. Maximize the window.
//    4. Apply wait for 10 seconds.
//    5. Using name attribute select "French Guianan" in dropdown.
//    6. Open new tab.
//    7. Open url :: wikipedia.org
//    8. Maximize the window.
//    9. Apply wait for 10 seconds.
//    10. from the dropdown select multiple values using visibleText, index and value.
//    11.Print the number of
//
//     */
//
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://way2automation.com/way2auto_jquery/index.php");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.name("country")).sendKeys("Greece");
//
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.wikipedia.org/");
//
//        WebElement elements = driver.findElement(By.id("searchLanguage"));
//        Select select = new Select(elements);
//        select.selectByValue("bg");
//        select.selectByVisibleText("Afrikaans");
//        select.selectByIndex(1);
//
//
//        List<WebElement> kk = driver.findElements(By.tagName("option"));
//        System.out.println(kk.size());
//        System.out.println(kk.get(7));
//
//        List<WebElement> ss = driver.findElements(By.tagName("a"));
//        System.out.println(ss.size());
//        driver.quit();
//    }
//}
