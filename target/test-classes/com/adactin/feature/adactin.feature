Feature: User Book A Hotel By Using Adactin Website
@tagName1
Scenario: User Login Into The Adactin Application

Given user Launch The Browser
When user Enter Their Username In Username Field
And user Enter Their Password In Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Scenario: user Search A Hotel 
When user Select A Hotel Location

