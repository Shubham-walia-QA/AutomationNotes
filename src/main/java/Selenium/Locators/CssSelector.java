package Selenium.Locators;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    /*

    Css Selector :- There are three ways to declaring css selector.
    1. tagName.className
    2. tagname#id or #id
    3. tagName[attribute='value']
    4. tagName[attribute='value']:nth-child(IndexNumber)
    5. //tagName[@attribute*='value'] - If we add * after the attribute it will treat it as regular expression, meaning it will
    also show the results having value string in between. Example //tagName[@attribute*='pass'] will fetch the results having
    attribute='password' or attribute='timepass'.
    6. tagName

    Note :- In Css Selector the class name having blank space should be written completely. like By.className we cannot write single class.


    Plugin:- To check whether an element is uniquely present on the page we can use:
    1. Selectors hub.
    2. ChroPath
    3. Dev Tool > Console >
        a. $('CssSelector')
        b. $x('xpath') - If there is single quote inside xpath replace it with double quote
        c. $$("[id='country']")

    Practice : -
    Old - (Done in IdName)
    1. Open https://rahulshettyacademy.com/locatorspractice.
    2. find id and enter username rahul.
    3. find name and  enter pwd hello123.
    4. Find class name of the sign In button and do click.
    New
    5. Capture the incorrect username or pwd error msg and display it in output. use css Selector

    .getText() - use to fetch the text of an element
     */

    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/locatorspractice");
    }
}
