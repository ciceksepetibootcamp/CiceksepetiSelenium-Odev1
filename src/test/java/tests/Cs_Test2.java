package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cs_Test2 extends BaseTest {
    @Test
    public void forgotPasswordTest() {
        driver.get("https://www.ciceksepeti.com/uye-girisi");
        driver.manage().window().maximize();
        driver.findElement(new By.ByCssSelector("a[class='login__forgot-password js-forgot-password']")).click();
        WebElement mail = driver.findElement(By.id("Mail"));
        mail.click();
        mail.sendKeys("uzundagdeniz@gmail.com");
        driver.findElement(new By.ByCssSelector("button[class='btn btn-lg btn-primary form-password-recovery__btn js-password-recovery-button']")).click();

    }

    @Test
    public void OrderTrac() {
        driver.get("https://www.ciceksepeti.com/siparis-takip");
        driver.findElement(new By.ByCssSelector("input[name='OrderCode']")).click();
        driver.findElement(new By.ByCssSelector("input[name='OrderCode']")).sendKeys("123456");
        driver.findElement(new By.ByCssSelector("input[name='CustomerEmail']")).click();
        driver.findElement(new By.ByCssSelector("input[name='CustomerEmail']")).sendKeys("uzundagdeniz@gmail.com");
        driver.findElement(new By.ByCssSelector("button[class='order-tracking-form__btn btn btn-primary btn-lg js-order-tracking-button']")).click();


    }
}