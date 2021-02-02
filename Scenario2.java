
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.lever.co/traderev");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[normalize-space()='Location']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Toronto, Ontario, Canada']")).click();
    }
}
