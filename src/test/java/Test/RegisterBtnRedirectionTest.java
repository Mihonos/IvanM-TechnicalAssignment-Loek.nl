package Test;

import Base.BaseTest;
import Page.LoekHomePageRedirections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterBtnRedirectionTest extends BaseTest {

    LoekHomePageRedirections loekHomePageRedirections;

    @Before
    public void SetUpTest() {
        loekHomePageRedirections = new LoekHomePageRedirections();
    }

    @Test
    public void RegisterBtnRedirectionTest() {
        loekHomePageRedirections.registerBtnleadsToRegistrationPage();
        loekHomePageRedirections.registerNowBtnLeadsToRegistrationPage();
        Assert.assertEquals("https://app.loekonline.nl/user/register", loekHomePageRedirections.registerBtnleadsToRegistrationPage());
        Assert.assertEquals("https://app.loekonline.nl/user/register", loekHomePageRedirections.registerNowBtnLeadsToRegistrationPage());
    }
}
