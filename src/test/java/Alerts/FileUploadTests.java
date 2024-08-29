package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class FileUploadTests extends BaseTests{

    @Test
    public void testFileUpLoad(){
        var uploadPage = homePage.clickFileUpload();
        //absolute path C:\Users\Ignacio Tejera\webdriver_java\resources\chromedriver.exe
        uploadPage.uploadFile("C:\\Users\\Ignacio Tejera\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", "Uploaded");


    }
}
