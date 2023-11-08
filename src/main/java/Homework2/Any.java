package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Any {
    public static <bool> void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://epicentrk.ua/");
        WebElement element  = driver.findElement(By.xpath("//span[@class = 'header__login-opener-icon']"));
        boolean isDisplayed = element.isDisplayed();
        System.out.println("sucsess" + " " + isDisplayed);
        driver.quit();
    }
}
