
Feature: Login functionality

Scenario: Login with valid credentials
Given User has naviagetd to login page
When Users enters valid email address "" into email field
And User has entered valid password "12345" into password field
And User clicks on Login button
Then User should get successfully logged in 


Scenario: Login with invalid credentials
Given User has naviagetd to login page
When Users enters invalid email address "" into email field
And User has entered invalid password "12345u7" into password field
And User clicks on Login button
Then User should get successfully logged in 


Scenario: Login with invalid email and valid password
Given User has naviagetd to login page
When Users enters invalid email address "" into email field
And User has entered valid password "12345" into password field
And User clicks on Login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User has naviagetd to login page
When Users enters invalid email address "" into email field
And User has entered valid password "12345" into password field
And User clicks on Login button
Then User should get proper warning message about credentials mismatch 
 
