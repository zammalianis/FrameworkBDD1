Feature: Login page Automation of saucedemo APP
Scenario Outline: check login is successful with valid creds
Given user is login page
When user enter "<username>" and "<password>"
And click on login button
Then user is navigated to Home page
And close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |