package testsuite;

import basetesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHr extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        //Navigate to website
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldBeAbleToVerifyTextSuccessfully() {

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        String expectedText = "Welcome Paul";
        String actualText = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
        if (expectedText.equals(actualText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
        driver.findElement(By.xpath("//div[@id='branding']/a[2]")).click();
        //Logout
        driver.findElement(By.linkText("Logout")).click();
        //verify the login panel message
        String expectedText1 = "LOGIN Panel";
        WebElement text = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String actualText1 = text.getText();
        Assert.assertEquals("Login Panel message not displayed", expectedText1, actualText1);
    }

    @After
    public void tearDown() {
       
    }



}
