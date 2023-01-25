#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Create Account testing
  user should be allowed to create account

  @tag1
  Scenario: Registration form
    Given User must be on the home page by entering the url "amazon.ca"
    When clicking on url "Start Here"
    Then Registration form should be opened

  Scenario: Checking functionality of verify mobile number button
    Given User must be on the home page by entering the url "amazon.ca"
    When clicking on url "Start Here"
    And Enter valid Your name, Mobile number, Password and Password again
    Then Verify Mobile number button should be visible

  Scenario: Checking functionality of verify email button
    Given User must be on the home page by entering the url "amazon.ca"
    When clicking on url "Start Here"
    And Enter valid Your name, email, Password and Password again
    Then Verify email button should be visible
    
  

  @tag2
  Scenario Outline: Checking functionality of create account form with invalid data set
    Given User must be on the home page by entering the url "amazon.ca"
    When clicking on url "Start Here"
    And Enter <Your_name> and <Mobile_number> and <Password> and <Password again>
    And click on Continue or verify email or verify mobile number button
    Then Error message should be displayed

    Examples: 
      | Your_name | Mobile_number | Password | Password_again |
      |           |    8073565081 | abcd1234 | abcd1234       |
      | parth     |               | abcd1234 | abcd1234       |
      | parth     |    8073565081 | abcd     | abcd           |
      | parth     |    8073565081 | abcd1234 | abcd123        |
      | parth     |    8073565081 |          | abcd1234       |

 