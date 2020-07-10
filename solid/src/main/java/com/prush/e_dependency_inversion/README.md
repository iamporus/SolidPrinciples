
# Dependency Inversion Principle
- High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces).
- Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

### Benefits
- Increases the reusability of the higher-level components.
- Lower level modules no longer tightly coupled with higher level, so you can change/replace them without making any changes to
 higher level modules.


### Insights
- If your code follows Open-Close Principle and Liskov Substitution Principle, it will automagically follow 
Dependency Inversion Principle.


### Walkthrough of the Example
 
 - Scenario: An API repository (High-level module) depending on a network library (Low-level module) for making api request to a web service.
 - Actions: 
   - Head over to the **_bad_** package.
   - Understand the problematic approach - **BadLoginUseCase** class.
   - Read all the comments added.
   - Head over to the **_good_** package.
   - Find a solution which follows Dependency Inversion Principle - **GoodLoginUseCase** class.