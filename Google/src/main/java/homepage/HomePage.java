package homepage;

import databases.ConnectToSqlDB;
import googleWebElements.GoogleWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

import java.io.IOException;

import static common.WebAPI.navigateBack;
import static common.WebAPI.sleepFor;

public class HomePage extends GoogleWebElements {

    @FindBy(xpath = searchBox)
    public static WebElement googleSearchBox;
    private static Object InterruptedException;

    public static WebElement getGoogleSearchBox() {
        return googleSearchBox;
    }

    public static void searchDatabase() throws Exception {
        for (int i = 0; i < ConnectToSqlDB.readDataBase("Bushratable", "searchItems").size(); i++) {
            getGoogleSearchBox().sendKeys(ConnectToSqlDB.readDataBase("BushraTable", "searchItems").get(i), Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }

    public static void searchFromExcel() throws InterruptedException, IOException {
        String[][] ExclArray = DataReader.fileReader1("/Users/faisalkarim/IdeaProjects/BootcampSelenium2019/Google/src/excellFiles/Book.xls", 0);
        for (int i = 1; i < ExclArray.length; i++) {
            System.out.println("ExclArray[i][0]");
            driver.findElement(By.xpath(searchBox)).sendKeys(ExclArray[i][0], Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }


}