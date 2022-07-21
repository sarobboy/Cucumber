#Author: saravanan@zoho.com
Feature: Tv Purchase
  I want to use this template for my feature file
  
  Background:
  Given user launches flipkart application
    And user login to flikart

   Scenario: Tv
    When user search Tv 
    And user choose the Tv and doing payments
    Then user receives order confirmation message

   Scenario: Tv one dim list
   
    When user search Tv by using one dim list
    |Onida|redmi|sony|
    And user choose the Tv and doing payments
    Then user receives order confirmation message
    
    Scenario: Tv one dim map
    
    When user search Tv by using one dim map
    |TV1|Onida|
    |Tv2|redmi|
    |Tv3|LG|
    And user choose the Tv and doing payments
    Then user receives order confirmation message

  Scenario Outline: All Tv
      
    When user search Tv "<TV>"
    And user choose the Tv and doing payments
    Then user receives order confirmation message

    Examples: 
      | Tv  |
      | Sony |
      | LG  |
      | Onida  |