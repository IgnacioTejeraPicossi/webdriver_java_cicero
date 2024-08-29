package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
     public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        String linkText;
        clickLink(linkText = "Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        String linkText;
        clickLink(linkText = "Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
         String linkText;
        clickLink(linkText = "Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage  clickKeyPresses(){
        String linkText;
        clickLink(linkText = "Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage  clickHorizonalSlider(){
        String linkText;
        clickLink(linkText = "Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage  clickJavaScriptAlerts(){
        String linkText;
        clickLink(linkText = "JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage  clickFileUpload(){
        String linkText;
        clickLink(linkText = "File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        String linkText;
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        String linkText;
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        String linkText;
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        String linkText;
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
