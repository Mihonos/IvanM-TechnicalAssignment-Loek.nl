package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoekHomePageRedirections extends BaseTest {

    public LoekHomePageRedirections() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logo")
    WebElement logoBtn;
    @FindBy(css = ".menu-item-23980:not(.et_first_mobile_item)")
    WebElement aboutUsBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[2]")
    WebElement pricesBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[3]")
    WebElement contactBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[4]")
    WebElement loginBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[5]/a")
    WebElement registerBtn;

    // Header buttons redirections next x methods

    public String logoBtnLeadsToHomePage(){
        logoBtn.click();
        String currentURL = driver.getCurrentUrl();
        return currentURL = "https://loekonline.nl/";
    }
    public String aboutUsBtnLeadsToOverOnsPage(){
        aboutUsBtn.click();
        String URL = driver.getCurrentUrl();
        return URL ="https://loekonline.nl/over-ons/";
    }
    public String pricesBtnLeadsToPricesPage(){
        pricesBtn.click();
        String URL = driver.getCurrentUrl();
        return URL ="https://loekonline.nl/prijzen/";
    }
    public String contactBtnleadsToContactPage(){
        contactBtn.click();
        String URL = driver.getCurrentUrl();
        return URL ="https://loekonline.nl/contact/";
    }
    public String loginBtnleadsToLoginPage(){
        loginBtn.click();
        String URL = driver.getCurrentUrl();
        return URL ="https://app.loekonline.nl/user/login";
    }
    public String registerBtnleadsToRegistrationPage() {
        wdWait.until(ExpectedConditions.elementToBeClickable(registerBtn));
        registerBtn.click();
        String URL = driver.getCurrentUrl();
        return URL = "https://app.loekonline.nl/user/register";
    }

}
