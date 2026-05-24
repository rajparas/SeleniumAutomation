Feature: Login into application

Scenario: Positive test validating login
Given Iniatialize the browser with chrome
And Navigate to "QAClickAcademy" site
And Click on Login link in home page to land on Secure sign in page
When User enters "Username" and "password" and logs in
Then Verify that user is successfully logged in


