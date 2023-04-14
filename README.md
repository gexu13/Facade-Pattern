# Facade Pattern
Façade Pattern Team 2 - Chuwei Cai, Zi Hao Li, Gavin(Ge) Xu
## 1. Overview
Facade design pattern is a structural design pattern that was published in 1994. It is a sample solution for software developers to merging different interfaces in a complex system into a unified, higher-level central facade. 
## 2. Intent
The intent of facade is to provide users a single entry point when accessing the system. This allows users to interact with a simple interface instead of knowing about multiple classes in the system. 
## 3. Features
![Facade_Features](https://github.com/gexu13/Facade-Pattern/blob/main/Facade_Features.png)
[Cited from Digital Guide IONOS](https://www.ionos.com/digitalguide/websites/web-development/whats-the-facade-pattern/)
## 4. When should we use it?
The facade pattern is particularly useful when dealing with complex systems made up of multiple components. By using a facade,  we provide a simple and easy-to-use interface for users to perform complex tasks without needing to understand the underlying system. 
For instance, in a product ordering system, a facade can be used to expose only the essential features and operations needed for the user to place an order. This makes the system more intuitive, less error-prone, and easier to maintain over time. 
In addition, facade patter is also a powerful approach to do software project management. By using a facade, developers would have a communication interface, which reduces the coupling of between components, enables greater flexibility and the ability to adapt to changing requirements.
## 5. Our implementation
In our implementation, we created a _Shape_ interface which defines 3 methods: 1. Drawing a shape 2. Calculating the perimeter of a shape 3. Calculating the area of a shape. We made 3 concrete classes (_Triangle_, _Rectangle_ and _Circle_) to implement the _Shape_ interface. Afterwards, we created a facade class _ShapeManager_ to integrate all methods in 3 concrete classes. It would later be called by the driver class and delegate specific tasks to the concrete classes.
UML diagram of our code:
