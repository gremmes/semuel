import java.util.concurrent.TimeUnit;
import java.util.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

    private static ChromeDriver driver;

    String username = "jet.tuxx@gmail.com";
    String password = "T!metodie";

    void login(String user, String pass) {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.id("pass")).sendKeys(Keys.RETURN);
    }

    void logout() {

        driver.findElement(By.id("logoutMenu")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[12]/a")).click();

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void LogIn(){
        login(username, password);

        WebElement element = null;

        try{
            element = driver.findElement(By.id("left_nav_section_nodes"));
        }catch (Exception e){ }

        Assert.assertNotNull(element);
        logout();
    }

    @Test
    public void SerachFriend(){
        login(username, password);

        WebElement element = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchInput = driver.findElement(By.id("q"));
        searchInput.clear();
        searchInput.sendKeys("Иван");



        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement lookupBtn = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]/button"));
        lookupBtn.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            element = driver.findElement(By.className("browse_result_area"));
        }catch (Exception e){ }

        Assert.assertNotNull(element);
        logout();
    }

    @Test
    public void VisitFriend(){
        login(username, password);

        WebElement element = null;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchInput = driver.findElement(By.id("q"));
        searchInput.clear();
        //driver.findElement(By.id("q")).click();
        searchInput.sendKeys("Иван");
        searchInput.sendKeys(Keys.RETURN);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try{
            element = driver.findElement(By.id("intro_container_id"));
        }catch (Exception e){ }

        Assert.assertNotNull(element);
        logout();
    }

    @Test
    public void LogOut() throws InterruptedException {

        login(username, password);
        logout();
        Assert.assertNotNull(driver.findElement(By.id("pass")));
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}