@Regration
Feature: Ebay Filter Functionality
 
  Scenario: Filter  for Shirts by Sleeve Lenth
    Given Open Ebay website
    When In Searchfor shirts
    And Select Long Sleeve Shirt
    Then Item list should have only Long Sleeve related Products
