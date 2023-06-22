package Test;

import Base.BaseTest;
import Page.LoekHomePageRedirections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeaderBtnsRedirectionTest extends BaseTest {

    LoekHomePageRedirections loekHomePageRedirections;

    @Before
    public void SetUpTest(){
        loekHomePageRedirections = new LoekHomePageRedirections();
    }

    @Test
    public void HeaderBtnsRedirectionTest() {
        loekHomePageRedirections.logoBtnLeadsToHomePage();
        loekHomePageRedirections.aboutUsBtnLeadsToOverOnsPage();
        loekHomePageRedirections.pricesBtnLeadsToPricesPage();
        loekHomePageRedirections.contactBtnleadsToContactPage();
        loekHomePageRedirections.loginBtnleadsToLoginPage();
        Assert.assertEquals("https://loekonline.nl/", loekHomePageRedirections.logoBtnLeadsToHomePage());
        Assert.assertEquals("https://loekonline.nl/over-ons/", loekHomePageRedirections.aboutUsBtnLeadsToOverOnsPage());
        Assert.assertEquals("https://loekonline.nl/prijzen/", loekHomePageRedirections.pricesBtnLeadsToPricesPage());
        Assert.assertEquals("https://loekonline.nl/contact/", loekHomePageRedirections.contactBtnleadsToContactPage());
        Assert.assertEquals("https://app.loekonline.nl/user/login", loekHomePageRedirections.loginBtnleadsToLoginPage());
    }
}
