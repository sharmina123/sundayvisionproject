@Regration
Feature: Ebay Search Functionality
 
  Scenario: Search for Shirts
    Given Open Ebay website
    When Search for shirts
    Then Item list should have only  shirt related products 

    
