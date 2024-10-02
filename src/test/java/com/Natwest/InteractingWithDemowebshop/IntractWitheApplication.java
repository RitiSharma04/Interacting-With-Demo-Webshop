package com.Natwest.InteractingWithDemowebshop;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class IntractWitheApplication {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\InteractingWithDemowebshop\\src\\test\\java\\com\\Natwest\\InteractingWithDemowebshop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/fiction");
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mayank23@namvgurukul.org");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Riti@76546");
        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(@href,'/books')])[1]")).click();
        Thread.sleep(1000);
        // Click on the book with price $25
        driver.findElement(By.xpath("//a[contains(@href,'https://demowebshop.tricentis.com/books?price=-25')]/span[text()='25.00']")).click();
        Thread.sleep(1000);

        // Add the book to the cart
        driver.findElement(By.xpath("//input[contains(@class, 'button-2') and contains(@class, 'product-box-add-to-cart-button') and @value='Add to cart']")).click();
        Thread.sleep(1000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[@class='ico-cart']"))).click().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CountryId']")).sendKeys("India");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@class=\"state-input\"]")).sendKeys("New Delhi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class=\"zip-input\"]")).sendKeys("110027");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type=\"submit\"])[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Option[@value=\"41\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")).sendKeys("Delhi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")).sendKeys(" 123 Main Street faltu nager Unjane city 09899 unsuni contry");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("110027");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("23456789");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@class=\"button-1 new-address-next-step-button\"]")).click();
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[2]/p[1]/input[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();
        TakesScreenshot t=(TakesScreenshot) driver;
        File src=t.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\Welcome\\Pictures\\Camera Roll");
        FileUtils.copyFile(src,dest);
    }
}