package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Label {

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://epicentrk.ua/");
            WebElement element = driver.findElement(By.xpath("//span[@class = 'nc font-weight-700'][1]"));
            String text = element.getText();
            System.out.println( text );
            driver.quit();

        }
    }




