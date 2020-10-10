Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User Login into application with "jin" and "1234"
Then HomePage is displayed
And Cards are displayed


Scenario: Home page default login
Given User is on NetBanking landing page
When User Login into application with "john" and "4321"
Then HomePage is displayed
And Cards are not displayed


