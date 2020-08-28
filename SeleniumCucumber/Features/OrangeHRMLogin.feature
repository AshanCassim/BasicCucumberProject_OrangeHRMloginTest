Feature: OrangeHRM Login

@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/"
	And User enters Email as "Admin" and Password as "admin123"
	And Click on Login 
	Then Page url should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"
	When User click on Log out link 
	Then Final page url should be "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
	And close browser 
	
