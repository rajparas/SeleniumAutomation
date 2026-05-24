Feature: Facebook Login

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.facebook.com" site
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in

Examples: 
|username                   |password       |
|tops123@gmail.com          |tops@123     	|
|abc123@gmail.com           |abc@123        |

#That symbol | is called a pipe (sometimes also referred to as a vertical bar).
