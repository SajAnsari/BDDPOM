Feature: Free CRM Login

Scenario: Free CRM Login test scenario

	Given User is already on login page
	When User enters credentials
		| username | password |
		| corpdevops@gmail.com | CrmPro123 |
	Then Should display home page
	Then close the browser