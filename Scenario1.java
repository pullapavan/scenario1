
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe"); //TODo replace path with actuak chrome driver location....
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.traderev.com/en-ca/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[normalize-space()='Careers']")).click();

        String firstwindow = driver.getWindowHandle();

        Set<String> homepagewindow = driver.getWindowHandles();
        for (String data : homepagewindow) {
            if (!data.equals(firstwindow)) {
                driver.switchTo().window(data);
                break;
            }
        }
        driver.findElement(By.xpath("//a[normalize-space()='Canadian Opportunities']")).click();
    }
}
