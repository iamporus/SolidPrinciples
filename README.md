# SOLID Principles by Uncle Bob

This repo serves as a reference to a series of technical sessions conducted on SOLID Principles
at my workplace. 

- [**S**ingle Responsibility Principle](https://github.com/iamporus/SolidPrinciples/tree/master/solid/src/main/java/com/prush/solid_principles/a_single_responsibility)
- [**O**pen Close Principle](https://github.com/iamporus/SolidPrinciples/tree/master/solid/src/main/java/com/prush/solid_principles/b_open_close)
- [**L**iskov Substitution Principle](https://github.com/iamporus/SolidPrinciples/tree/master/solid/src/main/java/com/prush/solid_principles/c_liskov_substitution)
- [**I**nterface Segregation Principle](https://github.com/iamporus/SolidPrinciples/tree/master/solid/src/main/java/com/prush/solid_principles/d_interface_segregation)
- [**D**ependency Inversion Principle](https://github.com/iamporus/SolidPrinciples/tree/master/solid/src/main/java/com/prush/solid_principles/e_dependency_inversion)

Currently, the examples added are written using Java programming language. 
Anyone interested in contributing can fork and submit PR for other programming languages.

### Structure

- For explaining every principle, there's a separate package present in the repo with respective principle's title.
- The package contains a **_bad_** implementation of an use case, typically a mock or stub which doesn't follow the respective principle.
- Also, it has a modified **_good_** implementation of the same use case, which follows the respective principle.
- Every package has a dedicated README for explaining the principle as well as info about the use case described. 

### Note

- The code examples added here are not executable in nature and will never be that way in future.
- They only demonstrate scenarios to help understand the principles in more practical way.
