Feature: Fill in details for new gmail account

@Reg
Scenario: Fill in details for new gmail account and proceed
Given User is in the gmail signup page
When User fills in all the deatils
	|abc|ddf|nonamesdfsd123|jhkjhdf#123|jhkjhdf#123|
And User clicks show password check box
Then User clicks on next button