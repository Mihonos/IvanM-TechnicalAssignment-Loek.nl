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

    @FindBy(css = "#logo")
    WebElement logoBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[1]")
    WebElement aboutUsBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[2]")
    WebElement pricesBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[3]")
    WebElement contactBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[4]")
    WebElement loginBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[5]/a")
    WebElement registerBtn;
    @FindBy(className = "et_pb_promo_button")
    WebElement registerNowBtn;

    // Header buttons redirections next x methods

    public String logoBtnLeadsToHomePage(){
        logoBtn.click();
        return driver.getCurrentUrl();
    }
    public String aboutUsBtnLeadsToOverOnsPage(){
        aboutUsBtn.click();
        return driver.getCurrentUrl();
    }
    public String pricesBtnLeadsToPricesPage(){
        pricesBtn.click();
        return driver.getCurrentUrl();
    }
    public String contactBtnleadsToContactPage(){
        contactBtn.click();
        return driver.getCurrentUrl();
    }
    public String loginBtnleadsToLoginPage(){
        loginBtn.click();
        return driver.getCurrentUrl();
    }
    public String registerBtnleadsToRegistrationPage() {
        wdWait.until(ExpectedConditions.elementToBeClickable(registerBtn));
        registerBtn.click();
        return driver.getCurrentUrl();
    }
    public String registerNowBtnLeadsToRegistrationPage(){
        registerNowBtn.click();
        return driver.getCurrentUrl();
    }

}
