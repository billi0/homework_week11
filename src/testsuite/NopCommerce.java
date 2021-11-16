package testsuite;

import basetesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NopCommerce extends BaseTest {
    String baseUrl = "https://www.google.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldLoginToComputersPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Computers")).click();
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldLoginToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Electronics")).click();
        String expectedMessage2 = "Electronics";
        WebElement message2 = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage2 = message2.getText();
        Assert.assertEquals(expectedMessage2, actualMessage2);
    }

    @Test
    public void verifyUserShouldLoginToApparelsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage3 = "Apparel";
        WebElement message3 = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage3 = message3.getText();
        Assert.assertEquals(expectedMessage3, actualMessage3);

    }


    @Test
    public void verifyUserShouldLoginToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage4 = "Digital downloads";
        WebElement message4 = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage4 = message4.getText();
        Assert.assertEquals(expectedMessage4, actualMessage4);

    }

    @Test
    public void verifyUserShouldLoginToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Books")).click();
        String expectedMessage5 = "Books";
        WebElement message5 = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage5 = message5.getText();
        Assert.assertEquals(expectedMessage5, actualMessage5);

    }

    @Test
    public void verifyUserShouldLoginToJewelleryPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedMessage6 = "Jewelry";
        WebElement message6 = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage6 = message6.getText();
        Assert.assertEquals(expectedMessage6, actualMessage6);

    }

    @Test
    public void verifyUserShouldLoginToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage7 = "Gift Cards";
        WebElement message7 = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage7 = message7.getText();
        Assert.assertEquals(expectedMessage7, actualMessage7);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

