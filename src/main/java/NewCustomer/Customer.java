package NewCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Customer {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/");

        LOGIN1();
        LOGIN2();
        LOGIN3();
        NewCustomer();
    }

    public static void LOGIN1(){
        WebElement userid= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        userid.clear();
        userid.sendKeys("mngr355631");
    }

    public static void LOGIN2(){
        WebElement password= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
        password.clear();
        password.sendKeys("gEpuhAn");

    }

    public static void LOGIN3(){
        WebElement click= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        click.click();
    }

    public static void NewCustomer(){
        WebElement customer= driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a"));
        customer.click();
    }



}
