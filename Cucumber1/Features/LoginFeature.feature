Feature: Login

  Scenario: Successful login with valid Credentials
    Given user Launch Chrome browser
    When User open URl "https://online.actitime.com/abc1/login.do"
    And User enter email as "speedwaytech74@gmail.com" and Password as "Speedway@123"
    And Click on login 
    Then page Title Should be "actiTIME - Licenses"
    When User Click on logout link
    Then page Title Should be "actiTIME - Login"
    Then close browser
    
   Scenario Outline: Successful login with valid Credentials DDT
    Given user Launch Chrome browser
    When User open URl "https://online.actitime.com/abc1/login.do"
    And User enter email as "<email>" and Password as "<password>"
    And Click on login 
    Then page Title Should be "actiTIME - Licenses"
    When User Click on logout link
    Then page Title Should be "actiTIME - Login"
    Then close browser
    
   Examples:
   |email|password|
   |speedwaytech74@gmail.com|Speedway@123|
   |spedwaytech74@gmail.com|admin@123|
   |speedway@74gmail.com|Sujeet@123|