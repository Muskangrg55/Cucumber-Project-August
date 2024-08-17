
Feature: Feature to test Bank application login
  
  @smoke
  Scenario: Home page
  
    Given User navigate to Login page
     When User enters username 
     And User enters password
    And User clicks Login
    Then Bank homepage displayed
    And User account information displayed
    
 