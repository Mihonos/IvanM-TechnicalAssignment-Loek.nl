package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoekHomePageRedirections extends BaseTest {

    public LoekHomePageRedirections() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logo")
    WebElement logoBtn;
    @FindBy(css = ".menu-item-23980:not(.et_first_mobile_item)")
    WebElement aboutUsBtn;

    // Header buttons redirections next x methods

    public String logoBtnLeadsToHomePage(){
        logoBtn.click();
        String currentURL = driver.getCurrentUrl();
        return currentURL = "https://loekonline.nl/";
    }

    public String aboutUsBtnLeadsToPrijzenPage(){
        aboutUsBtn.click();
        String URL = driver.getCurrentUrl();
        return URL ="https://loekonline.nl/prijzen/";
    }





}
