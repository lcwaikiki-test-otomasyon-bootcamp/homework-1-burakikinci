import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR"); //Websiteye gider.

        WebElement element1 = driver.findElement(By.cssSelector(".cart-dropdown .header-dropdown-toggle[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"]"));
        element1.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element2 = driver.findElement(By.cssSelector(".login-form__link[href=\"https://www.lcwaikiki.com/tr-TR/TR/uye-ol\"]"));
        element2.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element3 = driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail"));
        element3.sendKeys("yanlismail@mail.com");  //mail adresinin girilmesi.

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element4 = driver.findElement(By.cssSelector("#RegisterFormView_Password"));
        element4.sendKeys("1234");  //şifrenin girilmesi

        try {
            Thread.sleep(1000);  // 1saniye bekleme.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element5 = driver.findElement(By.cssSelector("img[src='/Resource/Images/customer/show-password-open.png']"));
        element5.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element6 = driver.findElement(By.cssSelector("#RegisterFormView_Password-error"));
        String ErrorMessage =element6.getText();
        System.out.println(ErrorMessage);   // Hatanın konsola yazdırılması








    }

}
