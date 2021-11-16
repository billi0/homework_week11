package testsuite;

import basetesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoPractice extends BaseTest {
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        //Navigate to website
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldBeAbleToSignInSuccessfully() {

        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12^&_l");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
        String expectedErrorMessage = "There is 1 error";
        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualErrorMessage = message.getText();
        Assert.assertEquals("Error Message is not Displayed Correctly", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
