package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StartPage extends Utility {
    /* By StartNewButton = By.xpath("//a[@class='gem-c-button govuk-button govuk-button--start']");

     WebElement dropdown = driver.findElement(By.xpath("//select[@id='response']"));

     By nextstep = By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");
     By resultpage = By.xpath("//h1[@class='govuk-fieldset__heading gem-c-radio__heading-text']");
     By travelpage = By.xpath("");

     public void clickStartNow() {
         clickOnElement(StartNewButton);
     }

     public void setSelectnationality(String natinality) {
         Select select = new Select(dropdown);
         select.selectByVisibleText(natinality);
     }

     public void clicknextstep() {
         clickOnElement(nextstep);
     }

     public void getResultMessage(String message) {
         sendTextToElement(resultpage, message);

     }

     public void confirmResultMessage(String expectedMessage) {

     }

     By nextstep1 = By.xpath("//button[@id='next-step']");

     By reason = By.xpath("//select[@id='reason-for-visit']");

     public void selectReasonForVisit(String reason) {

     }

     public void clickNextStepButton1() {
         clickOnElement(nextstep1);

         By nextstep2 = By.xpath("//button[@id='next-step']");
         clickOnElement(nextstep2);
         By agree = By.xpath("//input[@id='yes']");
         clickOnElement(agree);
         By agree1 = By.xpath("//input[@id='no']");
         clickOnElement(agree1);}
         public void selectImmigrationStatus ( String status){
         }



     public void clickNextStepButton3() {


         By nextstep3 = By.xpath("//button[@id='next-step']");
         By stay = By.xpath("//input[@id='moreThanSixMonths']");}
         public void selectLengthOfStay ( String moreOrLess){
         }
         public void clickNextStepButton ( ) {

         }*/
    By startNowButton = By.xpath("//a[@class='gem-c-button govuk-button govuk-button--start']");
    By nextStepButton = By.xpath("//button[text()='Next step']");
    // By selectJobTypeList = By.xpath("//select[@id='job_type']");

   // By nationalityDropDownList = By.xpath("//select[@id='nationality']");

    public void setSelectnationality(String natinality) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='response']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(natinality);
    }
    By resultMessage = By.xpath("//div[@id='result-info']");
    By reasonForVisitList = By.xpath("//input[@id='response-0']");
    By nextStepButton2 = By.xpath("//button[text()='Continue']");

    public void clickStartNow() {
        clickOnElement(startNowButton);
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
    public void selectReasonForVisit() {
        clickOnElement(reasonForVisitList);
    }

    public void nextStepButton1() {
        clickOnElement(nextStepButton);
    }

    public void setNextStepButton2() {
        clickOnElement(nextStepButton2);
    }
    public void anAustralianComingToUKForTourism() {
        clickStartNow();
        setSelectnationality("Australia");
        clickNextStepButton();
        selectReasonForVisit();
        clickNextStepButton();
        //confirmResultMessage(""Tourism or visiting family and friends"");
    }


}






