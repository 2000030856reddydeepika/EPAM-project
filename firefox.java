package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    @Test
    public void Test()
    {
        System.out.println("welcome");
        WebDriver driver = new FirefoxDriver();
        System.out.println(driver.getTitle());
        driver.get("https://www.github.com/login");

        driver.findElement(By.id("login_field")).sendKeys("2000030856@kluniversity.in");
        highlight(driver,driver.findElement(By.id("login_field")));

        driver.findElement(By.name("password")).sendKeys("welcome");
        highlight(driver,driver.findElement(By.name("password")));

        driver.findElement(By.className("header-logo"));
        highlight(driver,driver.findElement(By.className("header-logo")));

        //driver.findElement(By.linkText("Forgot password?")).click();
        highlight(driver,driver.findElement(By.linkText("Forgot password?")));

        //driver.findElement(By.partialLinkText("Create an account")).click();
        driver.findElement(By.tagName("h1"));
        highlight(driver,driver.findElement(By.tagName("h1")));

    }
    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background : orange;')",element);
    }
}
