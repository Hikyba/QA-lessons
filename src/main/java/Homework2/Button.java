package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Button {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://epicentrk.ua/");
        WebElement element = driver.findElement(By.xpath("//div[@class='header__menu-opener-button']"));
                element.click();
        System.out.println("Catalogue open sucsessfully");
    }

}
