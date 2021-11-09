package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String productName = "Apple iPhone 11 (64GB) - White (includes EarPods, power adapter)";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName, Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String priceOfProduct = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 11 (64GB) - White')]/../../../../div[3]/div/a/span[1]/span[1] | //span[contains(text(),'Apple iPhone 11 (64GB) - White (includes EarPods, power adapter)')]/../../../../div[3]/div/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();

        System.out.println("**Price of Product***==="+priceOfProduct);


    }

}
