package tests;

import main.TestSuiteBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.util.List;

/**
 * Created by Irina on 01.08.17.
 */
public class HidingPhoneNumbers extends TestSuiteBase {
    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 1)
    public void test1CheckHideNum() {
        openPage("https://auto.ria.com/car/bmw/");
        checkHideNumberForCatalogWithMainPage();
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 2)
    public void test2CheckHideNum() {
        openPageWithCookies("https://auto.ria.com/legkovie/audi/100/", "left_filter_test", "6");

        checkHideNumberForCatalogWithoutMainPage(hideNumberMainPage.getLinkOnMegaPhoto());
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 3)
    public void test3CheckHideNum() {
        hideNumberMainPage.pressNextPage();

        checkHideNumberForCatalogWithoutMainPage(hideNumberMainPage.getLinkOnMegaPhoto());
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 4)
    public void test4CheckHideNum() {
        openPageWithCookies("https://auto.ria.com/legkovie/audi/100/", "left_filter_test", "1");

        checkHideNumberForCatalogWithoutMainPage(hideNumberMainPage.getLinkOnMegaPhoto());
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 5)
    public void test5CheckHideNum() {
        hideNumberMainPage.pressNextPage();

        checkHideNumberForCatalogWithoutMainPage(hideNumberMainPage.getLinkOnMegaPhoto());
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 6)
    public void test6CheckHideNum() {
        openPage("https://auto.ria.com/dealers/");

//        int count_i = hideNumberMainPage.getPhoneNumberDealers().size();
//        int count_j =
    }

    //мегафото
    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 8)
    public void test8CheckHideNum() {
        openPage("https://auto.ria.com/car/bmw/x5/");

//        checkHideNumberForCatalogWithMainPage();
        checkHidePhoneNumberMegaPhoto(hideNumberMainPage.getLinkOnMegaPhoto());

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();
        mainPage.waiter(By.cssSelector(".wrapper-panel"), 80);

        checkHidePhoneNumberMegaPhoto(hideNumberMainPage.getLinkOnMegaPhoto());
    }


    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 9)
    public void test9CheckHideNum() {

        openPageWithCookies("https://auto.ria.com/car/bmw/x5/?page=1", "left_filter_test", "6");

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );
    }



    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 10)
    public void test10CheckHideNum() {

        openPageWithCookies("https://auto.ria.com/car/bmw/x5/?page=1", "left_filter_test", "1");

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );
    }


    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 11)
    public void test11CheckHideNum() {
        openPage("https://auto.ria.com/search/");

        mainPage.scroll();

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();

        mainPage.waiter(By.cssSelector(".form-explore"), 80);
        checkHidePhoneNumberMegaPhotoWithoutMain( );
    }


    /**Блокнот не перевырила, так як поки не добавляла туди оголошень***/
    /**Приховування номерыв в пошуку**/

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 13)
    public void test13CheckHideNum() {
        openPageWithCookies("https://auto.ria.com/search/", "left_filter_test", "6");

        mainPage.scroll();

        mainPage.waiter(By.cssSelector(".form-explore"), 120);
        checkHidePhoneNumberMegaPhotoWithoutMain( );

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();

        mainPage.waiter(By.cssSelector(".form-explore"), 120);
        checkHidePhoneNumberMegaPhotoWithoutMain( );
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 14)
    public void test14CheckHideNum() {
        openPageWithCookies("https://auto.ria.com/search/", "left_filter_test", "1");

        mainPage.scroll();

        mainPage.waiter(By.cssSelector(".form-explore"), 120);
        checkHidePhoneNumberMegaPhotoWithoutMain( );

        step("Закрываем поп-ап мегафото");
        hideNumberMainPage.getLinkCloseMegaPhoto().click();

        mainPage.waiter(By.cssSelector(".form-explore"), 120);
        checkHidePhoneNumberMegaPhotoWithoutMain( );
    }

    /**тут буде блокнот**/

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 18)
    public void test18CheckHideNum() {
        openPage("https://auto.ria.com/auto_changan_ideal_19299292.html");
        mainPage.checkEquals("ПРоверяем скрытый номер в блоке информации об продавце", hideNumberMainPage.getHideNumberInSelerBlock().getText().contains("xxx-xx-xx"), true,
                "НОмер телефона в блоке информации об продавце не скрытый");
        System.out.println(hideNumberMainPage.getShowPhoneNumberOnFinalPage().getText());
        hideNumberMainPage.getShowPhoneNumberOnFinalPage().click();


        System.out.println(hideNumberMainPage.getShowPhoneNumberOnFinalPage().getText());
        mainPage.checkEquals("ПРоверяем открытый номер в блоке информации об продавце", hideNumberMainPage.getShowPhoneNumberOnFinalPage().getText().contains("xxx-xx-xx"), false,
                "НОмер телефона в блоке информации об продавце не открытый");
    }

    @TestCaseId("https://chlist.sitechco.ru/project/9652/checklist/398767/details")
    @Test(priority = 19)
    public void test19CheckHideNum() {
        openPage("https://auto.ria.com/auto_changan_ideal_19299292.html");
        mainPage.checkEquals("ПРоверяем скрытый номер в блоке информации об продавце", hideNumberMainPage.getShowPhoneNumberOnWall().getText().contains("xxx-xx-xx"), true,
                "НОмер телефона в блоке информации об продавце не скрытый");
        System.out.println(hideNumberMainPage.getShowPhoneNumberOnFinalPage().getText());
        hideNumberMainPage.getShowPhoneNumberOnFinalPage().click();


        System.out.println(hideNumberMainPage.getShowPhoneNumberOnFinalPage().getText());
        mainPage.checkEquals("ПРоверяем открытый номер в блоке информации об продавце", hideNumberMainPage.getShowPhoneNumberOnWall().getText().contains("xxx-xx-xx"), false,
                "НОмер телефона в блоке информации об продавце не открытый");
    }


    public void checkHideNumberForCatalogWithMainPage() {
        int count = hideNumberMainPage.phoneNumberInAds.size();
        int countHide = 0;
        List<WebElement> ids = hideNumberMainPage.getIdAds();
//        List<WebElement> phoneBlockList = driver.findElements(By.xpath("//span[contains(@class, \"js-showPhoneBlock\")]/span"));
        List<WebElement> phoneBlockList = driver.findElements(By.xpath("//span[contains(@class, \"js-showPhoneBlock\")]"));

        for (int i = 0; i < count; i++) {

            String id = ids.get(i).getAttribute("data-advertisement-id");
            List<WebElement> buttonShow = hideNumberMainPage.getLinkShow();

            if (!hideNumberMainPage.getPhoneNumberInAds().get(i).getAttribute("class").contains("hide")) {

                String hideNumber = phoneBlockList.get(i).getAttribute("outerText");
                System.out.println(hideNumber);
                System.out.println(id);

                hideNumberMainPage.checkEquals("Проверяем скрытый номер телефона в объявлении " + id + "", hideNumber.contains("xxx-xx-xx"), true, "Номер телефона в объявлении " + id + " не скрытый");

                int countHideNumber = phoneBlockList.size();
                System.out.println(count);

                hideNumberMainPage.pressButtonShow(i - countHide);

                String showNumber = phoneBlockList.get(i).getAttribute("outerText");
                System.out.println(showNumber);
                Assert.assertFalse(showNumber.contains("xxx-xx-xx"));
                countHide += 1;
            }
        }
    }

    public void checkHideNumberForCatalogWithoutMainPage(List<WebElement> linkOnMegaPhoto) {
        int count = hideNumberMainPage.getPhoneNumberInAdsMainSearch().size();
        int countHide = 0;
        List<WebElement> ids = hideNumberMainPage.getIdAdsMainSearch();
        List<WebElement> phoneBlockList = driver.findElements(By.xpath("//span[contains(@class, \"js-showPhoneBlock\")]"));

        for (int i = 0; i < count; i++) {

            String id = ids.get(i).getAttribute("data-advertisement-id");
            List<WebElement> buttonShow = hideNumberMainPage.getLinkShow();

            if (!hideNumberMainPage.getPhoneNumberInAdsMainSearch().get(i).getAttribute("class").contains("hide")) {

                String hideNumber = phoneBlockList.get(i).getAttribute("outerText");
                System.out.println(hideNumber);
                System.out.println(id);

                hideNumberMainPage.checkEquals("Проверяем скрытый номер телефона в объявлении " + id + "", hideNumber.contains("xxx-xx-xx"), true, "Номер телефона в объявлении " + id + " не скрытый");

                int countHideNumber = phoneBlockList.size();
                System.out.println(count);

                hideNumberMainPage.pressButtonShow(i - countHide);

                String showNumber = phoneBlockList.get(i).getAttribute("outerText");
                System.out.println(showNumber);
                Assert.assertFalse(showNumber.contains("xxx-xx-xx"));
                countHide += 1;
            }
        }
    }

    public void checkHidePhoneNumberMegaPhoto(List<WebElement> element){
        int count = element.size();
        int randon = hideNumberMainPage.randInt(0, (count - 1));
        System.out.println(randon);

        mainPage.stepLog("Нажимаем на рандомное " + randon + " объявление");
        hideNumberMainPage.getLinkOnMegaPhoto().get(randon).click();
        mainPage.waiter(By.id("megaphotoBody"), 30);
//        System.out.println(driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText());
        mainPage.checkEquals("Проверяем что на объявлении скрытый номер телефона",
                driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText().contains("xxx-xx-xx"), true,
                "На объявлении номер телефона не скрытый");


        mainPage.stepLog("Нажимаем на кнопку \"Показать\" над скрытым телефонов в блоке мегафото");
        mainPage.waiter(hideNumberMainPage.getShowElementMegaPhoto(), 30);
        hideNumberMainPage.getShowElementMegaPhoto().click();
//        System.out.println(driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green")).getText());
        mainPage.checkNotEquals("Проверяем что на объявлении скрытый номер телефона",
                driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText().contains("xxx-xx-xx"), true,
                "На объявлении номер телефона не скрытый");
    }


    public void checkHidePhoneNumberMegaPhotoWithoutMain( ){
        int count = hideNumberMainPage.getLinkOnMegaPhotoWithoutMain().size();
        System.out.println(count);
        int randon = hideNumberMainPage.randInt(0, (count - 1));
        System.out.println(randon);

        mainPage.stepLog("Нажимаем на рандомное " + randon + " объявление");
        hideNumberMainPage.getLinkOnMegaPhotoWithoutMain().get(randon).click();
        mainPage.waiter(By.id("megaphotoBody"), 60);
        System.out.println(driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText());
        mainPage.checkEquals("Проверяем что на объявлении скрытый номер телефона",
                driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText().contains("xxx-xx-xx"), true,
                "На объявлении номер телефона не скрытый");


        mainPage.stepLog("Нажимаем на кнопку \"Показать\" над скрытым телефонов в блоке мегафото");
        hideNumberMainPage.getShowElementMegaPhoto().click();
        System.out.println(driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green")).getText());
        mainPage.checkNotEquals("Проверяем что на объявлении скрытый номер телефона",
                driver.findElement(By.cssSelector("#megaphotoUserInfo > span.bold.green > span")).getText().contains("xxx-xx-xx"), true,
                "На объявлении номер телефона не скрытый");


    }

}
