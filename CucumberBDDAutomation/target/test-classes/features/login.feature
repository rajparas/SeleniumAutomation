Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and Password "1234"
Then Home page is populated
And cards are displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "4567"
Then Home page is populated
And cards are not displayed are "false"