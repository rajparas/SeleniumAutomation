Feature: Application Login


Scenario: Home page default login
Given User is on landing page
When User login to application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on landing page
When User login to application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"