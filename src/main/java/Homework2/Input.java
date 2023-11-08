package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://epicentrk.ua/");
        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.click();
        WebElement inputElement = driver.findElement(By.xpath("//input[@type='text']"));
        inputElement.sendKeys("Корм");
        System.out.println("super");
    }
}




