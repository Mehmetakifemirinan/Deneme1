package seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com");
       driver.manage().window().maximize();//tam ekran yapar
        Thread.sleep(3000);//3 sn bekle
        driver.get("https://www.facebook.com");
        driver.navigate().back();//face den sonra amazona geri don
        Thread.sleep(3000);
        driver.navigate().forward();//amazondan faceye git
        Thread.sleep(3000);
        driver.navigate().refresh();



    }
}
