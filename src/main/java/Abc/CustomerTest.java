package Abc;

import NewCustomer.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomerTest extends Customer {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/");

        LOGIN1();
        LOGIN2();
        LOGIN3();
        NewCustomer();
        TC_001();
        TC_002();
        TC_003();
        TC_004();
        TC_005();
        TC_006();
        TC_007();


    }

    public static void TC_001() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Abrar");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("17041998");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("105622");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01257897658");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("abrar@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("25798");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 01 Pass");
        } else {
            System.out.println("Test Case 01 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_002() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("asshfbvghjbr yth");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("001546796");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("23521");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("015477876688");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("acd5675@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("031122");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 02 Pass");
        } else {
            System.out.println("Test Case 02 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_003() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Abid hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("04051998");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhakaaayuhh");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("107021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01754542684");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("wasik@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("333333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 03 Pass");
        } else {
            System.out.println("Test Case 03 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_004() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("milton das");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("12011997");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhakattttttttuuutttttttttttttttt");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("171097");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0160748779");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("nmcsg@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("904321");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 04 Pass");
        } else {
            System.out.println("Test Case 04 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();


    }

    public static void TC_005() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("asis alam");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("08011997");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhakaytttttttttrtr");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101521");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01537706753");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("asif@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("020202");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 05 Pass");
        } else {
            System.out.println("Test Case 05 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_006() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("siam ahmed");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("111011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("1010211");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0180356279");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("hasib@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 06 Pass");
        } else {
            System.out.println("Test Case 06 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_007() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("karim benzema");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("03012002");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101032");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01900765322790000");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("Benzu@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("113333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 07 Pass");
        } else {
            System.out.println("Test Case 07 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }
}


