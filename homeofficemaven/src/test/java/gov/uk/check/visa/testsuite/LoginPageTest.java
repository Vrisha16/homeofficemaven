package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.StartPage;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {



 StartPage startPage;
   @BeforeMethod

    public void inlt() {
      startPage = new StartPage();
   }

   @Test
    public void setStartPage(){startPage.anAustralianComingToUKForTourism();

   }
}
