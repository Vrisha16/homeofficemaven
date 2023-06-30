package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.excelutility.ExcelUtility;
import gov.uk.check.visa.pages.HomePage;
import gov.uk.check.visa.pages.LoginPage;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestWithExcelData extends TestBase {
    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void setExcel(){
        //Tell the code about the location of Excel file
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "LoginTests");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider
    public Object[][] getData(){
        return ExcelUtility.getTestData("Invalid_Login");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(String username, String password) {

    }

}
