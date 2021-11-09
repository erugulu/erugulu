package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makemytrip {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");

       WebElement element=  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
        element.click();
        Thread.sleep(5000);

        String flag = "False";


        while (flag == "False") {

            if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).size() > 0) {

                driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).click();
                flag = "True";
                Thread.sleep(5000);
            } else {
                Thread.sleep(5000);
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            }

        }


        System.out.println("Test case is passed");
        driver.close();
    }
}
