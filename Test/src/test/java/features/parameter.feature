Feature: Facebook Login

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.facebook.com" site
When User enters "nidhisavani5698@gmail.com" and "Nidhi8600!" and logs in
Then Verify that user is successfully logged in
