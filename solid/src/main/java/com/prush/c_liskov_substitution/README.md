
# Liskov Substitution Principle

- Objects should be replaceable with instances of their subtypes without altering the correctness of that program.
- Subtypes must be substitutable for their base types.

### Benefits

 - You can use your subclasses interchangeably without seeing unexpected behaviors.
 - Less overridden methods that are empty or throws an exception.

### Insights

 - If an override method does nothing or just throws an exception, then you're probably violating the LSP.
 
### Walkthrough of the Example
 
 - Scenario: Managing content (eg. audio/video/blog) for Free and Paid users of the system.
 - Actions: 
   - Head over to the **_bad_** package.
   - Understand the problematic approach - **BadUserContentBrowse** class.
   - Read all the comments added.
   - Head over to the **_good_** package.
   - Find a solution which follows Liskov Substitution Principle - **GoodUserContentBrowse** class.
