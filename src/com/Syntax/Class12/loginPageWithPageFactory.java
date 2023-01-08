package com.Syntax.Class12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.CommonMethods;

public class loginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernamefield;

    @FindBy (xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordfield;

    //@FindBy (css="input#btnLogin")
    @FindBy (id="btnLogin")
    public  WebElement loginbtn;

    //    call the constructor to intialize all elements
    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
