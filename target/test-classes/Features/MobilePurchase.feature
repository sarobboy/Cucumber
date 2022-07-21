#Author: saravanan@zoho.com
@tv
Feature: Mobile Purchase
  I want to use this template for my feature file
  @smoke @sanity
  Scenario: Mobiles
    Given user launches flipkart application
    And user login to flikart
    When user search mobile 
    And user choose the mobile and doing payments
    Then user receives order confirmation message
    
    Scenario: Mobile one dim list
    Given user launches flipkart application
    And user login to flikart
    When user search mobile by using one dim list
    |oppo|iphone|realme|
    And user choose the mobile and doing payments
    Then user receives order confirmation message
    
    Scenario: Mobile one dim map
    Given user launches flipkart application
    And user login to flikart
    When user search mobile by using one dim map
    |phone1|poco|
    |phone2|vivo|
    |phone3|one plus|
    And user choose the mobile and doing payments
    Then user receives order confirmation message

  Scenario Outline: All Mobiles
    Given user launches flipkart application
    And user login to flikart
    When user search mobile "<Phones>"
    And user choose the mobile and doing payments
    Then user receives order confirmation message

    Examples: 
      | Phones  |
      | Samsung |
      | Iphone  |
      | Realme  |
