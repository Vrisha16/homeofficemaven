package gov.uk.check.visa.pages;

import  gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Bhavesh
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){

        clickOnElement(loginLink);
    }




}
