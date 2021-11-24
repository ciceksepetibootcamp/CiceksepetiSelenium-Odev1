package tests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Cs_Test1 extends BaseTest {

    @Test
    public void blackFridayBasket(){
        driver.get("https://www.ciceksepeti.com/black-friday");
        driver.manage().window().maximize();
        driver.findElement(new By.ByCssSelector("img[data-position='0']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-subheader-close")));
        driver.findElement(By.className("js-subheader-close")).click();
        driver.findElement(new By.ByCssSelector("a[data-productcode='kcm87650471']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("label[for='productDetailValue-424']")));
        driver.findElement(new By.ByCssSelector("label[for='productDetailValue-424']")).click();
        driver.findElement(new By.ByCssSelector("span[class='product__action-button-text']")).click();


    }
    @Test
    public void removeBasket()
    {
        blackFridayBasket();
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("a[class='cart__item-delete icon-close js-main-product-delete--basket")));
        driver.findElement(new By.ByCssSelector("a[class='cart__item-delete icon-close js-main-product-delete--basket")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector("button[class='agree-button btn btn-primary']")));
        driver.findElement(new By.ByCssSelector("button[class='agree-button btn btn-primary']")).click();
    }


}
