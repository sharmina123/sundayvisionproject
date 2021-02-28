@Regration
Feature: Ebay Shopping Cart Functionality
 
  Scenario: Add Product to Shopping Cart   
   Given Open Ebay WebSite 
   When Search for Shirts
   And Select First Shirt product on itewm list
   And Select Color on Shirt
   And Select Quantity of Shirt
   Then Add to cart
   