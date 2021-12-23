@PhaseOne
Feature: CRM Contact & Deal Feature

Scenario: Create Contact
Given User is loggedIn
When User create a new contact
@SmokeTest
Scenario: View contact
Given User is loggedIn
When User view contact details 

Scenario: Update Contact
Given user is loggedIn
When User update a contact details


Scenario: Create Deal
Given User is loggedIn
When User create a new deal

@RegressionTest
Scenario: View Deal
Given User is loggedIn
When User view deal

Scenario: Update Deal
Given user is loggedIn
When User update a deal


Scenario: Logout
When User logout from App
