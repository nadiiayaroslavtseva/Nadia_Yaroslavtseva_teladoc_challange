package com.teladoc.pages;

import com.teladoc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnginCandidate {

    public EnginCandidate () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "btn btn-link pull-right")
    private WebElement addUserButton;
    public void clickOnAddUser(){
        addUserButton.click();
    }

    @FindBy (xpath = "//input[@name='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='LastName']")
    private WebElement lastName;

    @FindBy (xpath = "//input[@name='UserName']")
    private WebElement userName;

    @FindBy (xpath = "//input[@name='Password']")
    private WebElement password;

    public void information (String firstname, String lastname, String username, String Password){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        userName.sendKeys(username);
        password.sendKeys(Password);
    }

    @FindBy (xpath = "//select[@name='RoleId']")
    public WebElement role;
    public void selectingRole(String text) {
        Select select = new Select(role);
        if(text.equalsIgnoreCase("Sales Team")){
            select.selectByValue("Sales Team");
        }else if (text.equalsIgnoreCase("Customer")){
            select.selectByVisibleText("Customer");
        }else if (text.equalsIgnoreCase("Admin")){
            select.selectByVisibleText("Admin");
        }
    }

    @FindBy(name = "Email")
    private WebElement emailInput;

    public void setYourEmail(String email){
        emailInput.sendKeys(email);
    }

    @FindBy(name = "Mobilephone")
    private WebElement phoneNumber;

    public void inputYourMobileNumber(String phone){
        phoneNumber.sendKeys();
    }

    @FindBy(name = "btn btn-success")
    private WebElement saveButton;

    public void clickAndSave() {
        saveButton.click();

    }

}
