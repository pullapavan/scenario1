import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sceanrio3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.lever.co/traderev");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[normalize-space()='Location']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Toronto, Ontario, Canada']")).click();

        driver.findElement(By.xpath("//div[normalize-space()='Team']")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("li[aria-label='Engineering'] a[class='group-link']")).click();

        java.util.List<WebElement> apply = driver.findElements(By.className("posting-btn-submit"));

        int count = apply.isEmpty() ? 0 : apply.size();

        System.out.println("Available postings:  " + count);
    }
}
