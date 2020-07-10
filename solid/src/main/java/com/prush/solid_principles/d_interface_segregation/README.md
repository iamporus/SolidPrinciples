
# Interface Segregation Principle
No client should be forced to depend on methods it does not use.

### Benefits
-  Interfaces are are easier to implement fully, and thus less likely to break the Liskov Substitution Principle 
by being only partially implemented.
- Classes and their dependencies communicate using focused interfaces, minimizing dependencies and enabling reuse.

### Insights
-  As the Single Responsibility Principle (SRP) suggests to keep classes modular, ISP suggests to keep your interfaces modular 
and responsible for a single purpose.
-  Interfaces should be cohesive, meaning they should have groups of operations that logically belong together.
-  Fat interfaces are always bad. A change in an interface forces us to change all the classes those implement that interface.

### Walkthrough of the Example
 
 - Scenario: Displaying currently playing Track or Station playback controls.
 - Actions: 
   - Head over to the **_bad_** package.
   - Understand the problematic approach - **BadNowPlayingStationScreen** class.
   - Read all the comments added.
   - Head over to the **_good_** package.
   - Find a solution which follows Interface Segregation Principle - **GoodNowPlayingStationScreen** class.