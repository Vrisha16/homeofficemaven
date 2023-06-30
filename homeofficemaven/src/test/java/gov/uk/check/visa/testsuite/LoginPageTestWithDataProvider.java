package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.HomePage;
import gov.uk.check.visa.pages.LoginPage;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();

    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void VerifyLoginToNopCommerce(String username, String password){
    homePage.clickOnLoginLink();
   // loginPage.loginToApplication(username,password);
        loginPage.enterEmailId(username);
        loginPage.enterPassword(password);
        loginPage. clickOnLoginButton();
    }

}
