Feature: Login to internet banking webpage

@Sanity 
Scenario: Successful login to internet banking
Given User is in the login page
When user logins with "abc" and pwd "123" and clicks login button
Then user is navigated to the home page of the internet banking account

@Sanity1
Scenario: user logins with incorrect pwd to internet banking
Given User is in the login page
When user logins with "abc" and pwd "124" and clicks login button
Then user should not be navigated to the home page
And Appropriate error message should be displayed

@data
Scenario Outline: cucumber code for data parametrisation
Given  User is in the login page
When user logins in the firstpage with <UN> and pwd <PD> and clicks login button
Then user is navigated to the home page of the internet banking account

Examples:
|UN|PD|
|abc|cdf|
|sdd|ddd|






