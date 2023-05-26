package com.sedc.FinalProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

    public class SetUp {
        public static final int TIMEOUT = 15;
        protected static WebDriver driver;
        protected static WebDriverWait wait;

        public static void setup(){

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://magento.softwaretestingboard.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver,TIMEOUT);

        }


        public static void end(){
            sleep(3000);
            driver.quit();
        }

        public static void sleep(int milliSeconds) {
            try {
                Thread.sleep(milliSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }


