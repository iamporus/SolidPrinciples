
# Open Close Principle

Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

### Benefits

 - Allows new functionality to be added with minimum changes in the existing code.
 - Less amount of testing is required on adding a new functionality as chances of breaking existing code are less.
 - Ease of code maintenance.

### Insights
 - Use of following design patterns inherently achieves Open Close principle to your class.
   - Decorator Pattern
   - Factory Method Pattern
 
### Walkthrough of the Example
 
 - Scenario: Printing a Report/Invoice to a file for a purchase order.
 - Actions: 
   - Head over to the **_bad_** package inside b_open_close package.
   - Understand the problematic approach - **BadPrintReportUseCase** class.
   - Read all the comments added.
   - Head over to the **_good_** package inside b_open_close package.
   - Find a solution which follows Open Close Principle - **GoodPrintReportUseCase** class.
   