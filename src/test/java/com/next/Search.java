package com.next;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Search {

    private WebDriver driver;

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {

        WebDriverManager.chromedriver().setup(); // set up the driver
        driver = new ChromeDriver(); // creates browser instance
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();


    }

    @When("I enter {string} as a product")
    public void i_enter_as_a_product(String string) { // entering "Jeans"

        driver.findElement(By.id("header-big-screen-search-box")).sendKeys("Jeans");

    }

    @When("I click on search button")
    public void i_click_on_search_button() { // click on round search button

        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();

    }

    @Then("I should be able to see {string} as a result title")
    public void i_should_be_able_to_see_as_a_result_title(String string) throws InterruptedException { // comparing result title

        String expectedValue = "\"Jeans\"";
//        Thread.sleep(2000);
        String actualValue = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();

        Assert.assertEquals(expectedValue, actualValue);

        driver.close();

    }

}
