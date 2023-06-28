Feature: Login Functionality

Background:
Given user should be on login page



Scenario: TestCase1_InValidLogin
When user enters invalid userid and password and click on login button
And user can see error message on login page
And close app




@test
Scenario: TestCase2_ValidLogin
When user enters valid userid and password and click on login button
Then user should be navigated to home page 
And user can see logout link on the home page
And close app