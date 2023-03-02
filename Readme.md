You have to implement a backend for an online shop. The system should support such basic operations as:
 - User registration
 - User sign in and sign out
 - Product catalog navigation
 - Adding product to cart
 - Submitting an order
 - Checkout
 - Users management
 - And others

### MENU NAVIGATION

**Scenario - main menu**
- GIVEN I’m an app user 
- WHEN I run the program
- THEN I see the main menu

**Tech notes:**
Main menu consists of the next items:
1. Sign Up
2. Sign In / Sign Out
3. Product Catalog
4. My Orders
5. Settings
6. Customer List

When User is logged in, then paragraph 2 label is changed to “**Sign Out**” instead of **Sign In**.
</br>
</br>
**Scenario** - stop the program
- GIVEN I’m an app user
- AND I’m in main menu
- WHEN I enter ‘exit’ in console
- THEN program execution is stopped

**Scenario** - incorrect input handling
- GIVEN I’m an app user
- WHEN I entered any digit except 1, or 2, or 3, or 4, or 5
- THEN I see the error message “Only 1, 2, 3, 4, 5 is allowed. Try one more time.”
- AND I navigated back to the main menu


