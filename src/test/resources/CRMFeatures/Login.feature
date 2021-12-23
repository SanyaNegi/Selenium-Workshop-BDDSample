Feature: CRM Login Feature

#Scenario: Valid Login
#Given User is on Login page
#When User enters login Credentials
#Then User is on Home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User is on Home page

#Using Scenario Outline
#Scenario Outline: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then User is on Home page

#Examples: 
#	| username | password |
#	| testuser1 | welcome123|
#	| testuser1 | welcome123|
#	| tomsmith | SuperSecretPassword!|


#Giving data step level wise
Scenario Outline: Valid Login
Given User is on Login page
When User enters login credentials
	| username | password |
	| tomsmith | SuperSecretPassword!|
	
Then User is on Home page
	
	
	

