package com.teladoc.step_definitions;

import com.teladoc.pages.BaseClass;
import com.teladoc.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Scanner;

public class EngCandidate extends BaseClass {

    Scanner scan = new Scanner(System.in);

    @Given("User should be able to Open a browser")
    public void user_should_be_able_to_open_a_browser() {
        Driver.getDriver().get(url);
    }

    @When("I should click on the Add User Button")
    public void i_should_click_on_the_add_user_button () {
        enginCandidate.clickOnAddUser();
    }

    @When("I should be able fill out the information")
    public void i_should_be_able_fill_out_the_information () {
        System.out.println("what is your First name?");
        String firstName = scan.next();
        System.out.println("what is your Last name?");
        String lastName = scan.next();
        System.out.println("what is your user name?");
        String userName = scan.nextLine();
        System.out.println("Create password");
        String createPassword = scan.next(); //the user will be creating their password;
        enginCandidate.information(firstName,lastName,userName,createPassword);
        System.out.println("please select the Role that you have?");
        String role = scan.nextLine(); //the user is inputting the role
        enginCandidate.selectingRole(role);
    }

    @Then("I should be able to confirm the user name is in the Table")
    public void i_should_be_able_to_confirm_the_user_name_is_in_the_table () {
    }

    @When("I should be able to click on delete button")
    public void i_should_be_able_to_click_on_delete_button () {
    }

    @When("I should not be able to see previously created User")
    public void i_should_not_be_able_to_see_previously_created_user () {
    }

}