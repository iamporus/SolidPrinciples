
# Single Responsibility Principle

A class should have one, and only one, reason to change.

### Benefits

 - makes your software easier to implement and prevents unexpected side-effects of future changes.
 - clearly defined boundaries as to where a piece of functionality is implemented.
 - information-hiding practices that protect the integrity of data.
 - separation of concerns that ensures changes in one location do not affect others
 - ease of code maintenance.
 
 ### Walkthrough of the Example
 
 - Scenario: Signing Up a new user to a Mobile/Web app.
 - Actions: 
   - Head over to the **_bad_** package inside a_single_responsibility package.
   - Understand the problematic approach - BadUserSignUp class.
   - Read all the comments added.
   - Head over to the **_good_** package inside a_single_responsibility package.
   - Find a solution which follows Single Responsibility Principle - GoodUserSignUp class.
   