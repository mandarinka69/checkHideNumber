package tests;

import com.google.gson.Gson;
import com.thoughtworks.selenium.DefaultSelenium;
import main.TestSuiteBase;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.Test;

import java.io.IOException;


public class CheckLabels extends TestSuiteBase{
    @Test(priority = 1)
    public void test1() throws IOException {
        loginWithURl("4931149");
        openPage("https://auto.ria.com/auto_honda_cr_v_20232868.html");



//        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
//        for (LogEntry logEntry: logEntries.getAll()) {
//            System.err.println("BrowserConsole: " + logEntry.toString());
//        }






    }

}
