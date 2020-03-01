package testHomePage;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePage extends HomePage {

public static void getInitElements(){
    PageFactory.initElements(driver,HomePage.class);

}
@Test
    public static void testSearchfromDB() throws Exception{
    getInitElements();
    sleepFor(2);
    searchDatabase();
}
@Test
    public static void testSearchFromExcel() throws IOException, InterruptedException {
    getInitElements();
    sleepFor(2000);
    searchFromExcel();

}


}
