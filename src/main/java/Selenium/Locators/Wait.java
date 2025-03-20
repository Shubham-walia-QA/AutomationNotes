package Selenium.Locators;

public class Wait {

    /*

    Wait :- If something is not showing in the page then we will tell selenium to wait for some duration before throwing an error.

    Implicitly wait - We use this when we wait for something to show. Will add wait to all the code written after its declaration. Different page.
    Syntax :- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    Thread.sleep(100); :- We will use this wait when we want the app to come to stable state. same page but some animation

    Practice : -
    Old - (IdName)
    1. Open https://rahulshettyacademy.com/locatorspractice.
    2. find id and enter username rahul.
    3. find name and  enter pwd hello123.
    4. Find class name of the sign In button and do click.
    Old -  (CssSelector)
    5. Capture the incorrect username or pwd error msg and display it in output. use css Selector.
    New -
    6. Apply implicit wait statement to stop the testcase failing till the above error msg is not loaded.

    */
}
