package testsuite;

import basetesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class NopCommerceRegistration extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.cssSelector("#gender-female")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("John");
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Smith");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2000");
        driver.findElement(By.cssSelector("#Email")).sendKeys(getEmailString() +"@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Prime");
        driver.findElement(By.id("Password")).sendKeys("John12345");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("John12345");
        driver.findElement(By.cssSelector("#register-button")).click();
        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("user is not registered successfully", expectedMessage, actualMessage);


    }
    public String getEmailString(){
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail= new Random();
        while (email.length()<10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = email.toString();
        return saltStr;

    }



    @After
    public void tearDown() {
        closeBrowser();
    }


}
