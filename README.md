# Facade Pattern
Façade Pattern Team 2 - Chuwei Cai, Zi Hao Li, Gavin(Ge) Xu
## 1. Overview
Facade design pattern is a structural design pattern that was published in 1994. It is a sample solution for software developers to merging different interfaces in a complex system into a unified, higher-level central facade. 

Key vocabularies:
- **_Client_**: an object or a piece of code that utilizes facade interface.
- **_Facade_**: a class that serves as a front-facing interface masking more complex underlying or structural code. It wraps complicated subsystems and provides a set of functionalities to clients.
- **_Subsystem_**: a collection of classes that provides some functionalities.
## 2. Intent
The intent of facade is to provide clients a single entry point when accessing the system. This allows clinets to interact with a simple interface instead of knowing much about multiple classes in subsystems. 
## 3. Features
![Facade_Features](https://github.com/gexu13/Facade-Pattern/blob/main/Facade_Features.png)
[Cited from Digital Guide IONOS](https://www.ionos.com/digitalguide/websites/web-development/whats-the-facade-pattern/)
## 4. When should we use it?
The facade pattern is particularly useful when dealing with complex systems made up of multiple components. By using a facade,  we provide a simple and easy-to-use interface for clients to perform complex tasks without needing to understand the underlying subsystems. 

For instance, in a product ordering system, a facade (customer representative) services as a single interface to expose only essential features and operations needed for the client to place an order. This makes the system more intuitive, less error-prone, and easier to maintain. 
![Analogy](https://github.com/gexu13/Facade-Pattern/blob/main/Analogy.png)

In addition, facade patter is also a powerful approach to do software project management. By using a facade, developers would have a communication interface, which reduces the coupling of between components, enables greater flexibility and the ability to adapt to changing requirements.
## 5. Our implementation
In our implementation, we created a _Shape_ interface which defines 3 methods: 1. Drawing a shape 2. Calculating the perimeter of a shape 3. Calculating the area of a shape. We made 3 concrete classes (_Triangle_, _Rectangle_ and _Circle_) to implement the _Shape_ interface. Afterwards, we created a facade class _ShapeManager_ to integrate all methods in 3 concrete classes. It would later be called by the driver class and delegate specific tasks to the concrete classes.

UML diagram of our code:
## 6 Code Walk
## 7 References
1. Facade design pattern. (n.d.). Retrieved April 15, 2023, from _https://cs.uwaterloo.ca/~m2nagapp/courses/CS446/1195/Arch_Design_Activity/Facade.pdf_
2. Facade Design Pattern. SourceMaking. (n.d.). Retrieved April 15, 2023, from _https://sourcemaking.com/design_patterns/facade_ 
3. Facade pattern: Unified interface for software projects. IONOS Digital Guide. (n.d.). Retrieved April 15, 2023, from _https://www.ionos.com/digitalguide/websites/web-development/whats-the-facade-pattern/_
4. Design patterns - facade pattern. Tutorials Point. (n.d.). Retrieved April 15, 2023, from _https://www.tutorialspoint.com/design_pattern/facade_pattern.htm_ 
5. Facade. Refactoring.Guru. (n.d.). Retrieved April 15, 2023, from _https://refactoring.guru/design-patterns/facade_ 
