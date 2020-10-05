Feature: Shopping feature
Scenario: Verify Login Page

Given User Open Gallery Apk and navigate to dashboard screen
When User click Shrine Gallery
Then User is navigated to Shrine gallery login screen
And User click login button

Scenario: Add item to shopping cart without filter
Given User on Shrine Gallery Dashboard
When User select Stella Sunglasses item
Then Selected item Stella Sunglasses move to cart

Scenario: Add item to shopping cart on filter all
Given User on Shrine Gallery Dashboard with filter all
When User select Whitney Belt item
Then Selected item Whitney Belt move to cart

Scenario: Add item to shopping cart on filter Accessories
Given User on Shrine Gallery Dashboard with filter Accessories
When User select Vagabond Sack item
Then Selected item Vagabond Sack move to cart

Scenario: Add item to shopping cart on filter Clothing
Given User on Shrine Gallery Dashboard with filter Clothing
When User select Plaster Tunic item
Then Selected item Plaster Tunic move to cart

Scenario: Add item to shopping cart on filter Home
Given User on Shrine Gallery Dashboard with filter Home
When User select Gilt Desk Trio item
Then Selected item Gilt Desk Trio move to cart

Scenario: Remove item from shopping cart
Given User on shopping cart menu
When User remove items on shopping cart
Then Items removed from shopping cart list

Scenario: Clear items from shopping cart
Given User on shopping cart menu and want to clear item
When User tap clear cart
Then All items removed from shopping cart list

Scenario: User want to logout the application
Given User on Dashboard
When User tap filter menu
And User tap logout button
Then User successfully logout