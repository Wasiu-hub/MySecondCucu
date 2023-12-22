package com.next;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Search {

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {

        WebDriverManager.chromedriver().setup(); // set up the driver
        WebDriver driver = new ChromeDriver(); // creates browser instance
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();


    }
    @When("I enter {string} as a product")
    public void i_enter_as_a_product(String string) {

    }
    @When("I click on search button")
    public void i_click_on_search_button() {

    }
    @Then("I should be able to see {string} as a result title")
    public void i_should_be_able_to_see_as_a_result_title(String string) {

    }

}
