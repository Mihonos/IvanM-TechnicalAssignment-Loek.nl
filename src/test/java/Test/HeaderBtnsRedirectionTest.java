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
        Assert.assertEquals("https://loekonline.nl/", loekHomePageRedirections.logoBtnLeadsToHomePage());
    }


}
