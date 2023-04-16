# Facade Pattern
Façade Pattern Team 2 - Chuwei Cai, Zi Hao Li, Gavin(Ge) Xu
## 1. Overview
Facade design pattern is a structural design pattern that was published in 1994. It is a sample solution for software developers to merging different interfaces in a complex system into a unified, higher-level central facade. 

Key vocabularies[1]:
- **_Client_**: an object or a piece of code that utilizes facade interface.
- **_Facade_**: a class that serves as a front-facing interface masking more complex underlying or structural code. It wraps complicated subsystems and provides a set of functionalities to clients.
- **_Subsystem_**: a collection of classes that provides some functionalities.
## 2. Intent
The intent of facade is to provide clients a single entry point when accessing the system. This allows clinets to interact with a simple interface instead of knowing much about multiple classes in subsystems. 
## 3. Features
![Facade_Features](https://github.com/gexu13/Facade-Pattern/blob/main/res/Facade_Features.png) [Cited from Digital Guide IONOS](https://www.ionos.com/digitalguide/websites/web-development/whats-the-facade-pattern/)[2]
## 4. When should we use it?
The facade pattern is particularly useful when dealing with complex systems made up of multiple components. By using a facade,  we provide a simple and easy-to-use interface for clients to perform complex tasks without needing to understand the underlying subsystems. 

For instance, in a product ordering system, a facade (customer representative) services as a single interface to expose only essential features and operations needed for the client to place an order. This makes the system more intuitive, less error-prone, and easier to maintain. 
![Analogy](https://github.com/gexu13/Facade-Pattern/blob/main/res/Analogy.png) [Cited from REFACTORING GURU](https://refactoring.guru/design-patterns/facade)

In addition, facade pattern is also a powerful approach to do software project management. By using a facade, developers would have a communication interface, which reduces the coupling of between components, enables greater flexibility and the ability to adapt to changing requirements.
## 5. Our implementation
In our implementation, we created a _Shape_ interface which defines 3 methods: 1. Drawing a Shape 2. Calculating the perimeter of a Shape 3. Calculating the area of a Shape. We made 3 concrete classes (_Triangle_, _Rectangle_ and _Circle_) to implement the _Shape_ interface. Afterwards, we created a facade class _ShapeManager_ to integrate all methods in 3 concrete classes. It would later be called by the driver class and delegate specific tasks to the concrete classes.

UML diagram of our code:
![UML](https://github.com/gexu13/Facade-Pattern/blob/main/res/UML.png)
## 6. Code Walk
Step 1: Create Shape Interface
```Java
public interface Shape {

  void draw();
  
  double calculatePerimeter();
  
  double calculateArea();
}
```
Step 2: Create concrete classes Triangle, Rectangle and Circle implementing Shape Interface
```Java
public class Triangle implements Shape {
  private final double base;
  private final double height;
  
  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void draw() {
    String s = String.format("Drawing a triangle...with its base of %.2f and height of %.2f.", base, height);
    System.out.println(s);
  }

  @Override
  public double calculatePerimeter() {
    double side;
    side = Math.sqrt(Math.pow(height, 2) + Math.pow(0.5 * base, 2));
    return 2 * side + base;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }
}

```
```Java
public class Rectangle implements Shape {
  private final double length;
  private final double width;
  
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public void draw() {
    String s = String.format("Drawing a rectangle...with its length of %.2f and width of %.2f.", length, width);
    System.out.println(s);
  }

  @Override
  public double calculatePerimeter() {
    return 2 * length + 2 * width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }
}

```
```Java
public class Circle implements Shape {
  private final double diameter;
  
  public Circle(double diameter) {
    this.diameter = diameter;
  }

  @Override
  public void draw() {
    String s = String.format("Drawing a circle...with its diameter of %.2f.", diameter);
    System.out.println(s);
  }

  @Override
  public double calculatePerimeter() {
    return (Math.PI * diameter);
  }

  @Override
  public double calculateArea() {
    return (Math.PI * Math.pow(diameter, 2) / 4);
  }
}

```
Step 3: Create Facade Class
```Java
public class ShapeManager {
  private final Shape triangle;
  private final Shape rectangle;
  private final Shape circle;
  
  public ShapeManager(double triangleBase, double triangleHeight, double rectangleLength, double rectangleWidth, double circleDiameter) {
    triangle = new Triangle(triangleBase, triangleHeight);
    rectangle = new Rectangle(rectangleLength, rectangleWidth);
    circle = new Circle(circleDiameter);
  }
  
  public void drawTriangle() {
    triangle.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawCircle() {
    circle.draw();
  }

  public double calculateTrianglePerimeter() {
    return triangle.calculatePerimeter();
  }

  public double calculateTriangleArea() {
    return triangle.calculateArea();
  }

  public double calculateRectanglePerimeter() {
    return rectangle.calculatePerimeter();
  }

  public double calculateRectangleArea() {
    return rectangle.calculateArea();
  }

  public double calculateCirclePerimeter() {
    return circle.calculatePerimeter();
  }

  public double calculateCircleArea() {
    return circle.calculateArea();
  }
}

```
Step 4: Create driver(Demo) class  
        The facade class(shapeManager) provides all the functionalities of all shapes
```Java
public class Demo {

  public static void main(String[] args) {
    ShapeManager shapeManager = new ShapeManager(4.0, 5.0, 6.0, 7.0, 8.0);
    
    shapeManager.drawTriangle();
    shapeManager.drawRectangle();
    shapeManager.drawCircle();

    double trianglePerimeter = shapeManager.calculateTrianglePerimeter();
    System.out.printf("Triangle Perimeter: %.2f%n", trianglePerimeter);

    double triangleArea = shapeManager.calculateTriangleArea();
    System.out.printf("Triangle Area: %.2f%n", triangleArea);

    double rectanglePerimeter = shapeManager.calculateRectanglePerimeter();
    System.out.printf("Rectangle Perimeter: %.2f%n", rectanglePerimeter);

    double rectangleArea = shapeManager.calculateRectangleArea();
    System.out.printf("Rectangle Area: %.2f%n", rectangleArea);

    double circlePerimeter = shapeManager.calculateCirclePerimeter();
    System.out.printf("Circle Perimeter: %.2f%n", circlePerimeter);

    double circleArea = shapeManager.calculateCircleArea();
    System.out.printf("Circle Area: %.2f%n", circleArea);

  }
}
```
Step 5: Verify output
```Java
Drawing a triangle...with its base of 4.00 and height of 5.00.
Drawing a rectangle...with its length of 6.00 and width of 7.00.
Drawing a circle...with its diameter of 8.00.

Triangle Perimeter: 14.77
Triangle Area: 10.00
Rectangle Perimeter: 26.00
Rectangle Area: 42.00
Circle Perimeter: 25.13
Circle Area: 50.27
```
How to run it?

It is simple to run the program as the clients only interact with the facade (ShapeManager) which manages all components in the subsystems including Triangle, Rectangle and Circle.
In the Demo class, clients are able to call methods of ShapeManager and it would delegate specific taskes to concrate classes. For example, when shapeManager.drawTriangle() is called, a triangle would be drawn.

You may play with our Demo class by clicking "Run Demo.main()", no need to pass any arguments.

## 7. References
1. Facade design pattern. (n.d.). Retrieved April 15, 2023, from _https://cs.uwaterloo.ca/~m2nagapp/courses/CS446/1195/Arch_Design_Activity/Facade.pdf_
2. Facade pattern: Unified interface for software projects. IONOS Digital Guide. (n.d.). Retrieved April 15, 2023, from _https://www.ionos.com/digitalguide/websites/web-development/whats-the-facade-pattern/_
3. Facade Design Pattern. SourceMaking. (n.d.). Retrieved April 15, 2023, from _https://sourcemaking.com/design_patterns/facade_ 
4. Design patterns - facade pattern. Tutorials Point. (n.d.). Retrieved April 15, 2023, from _https://www.tutorialspoint.com/design_pattern/facade_pattern.htm_ 
5. Facade. Refactoring.Guru. (n.d.). Retrieved April 15, 2023, from _https://refactoring.guru/design-patterns/facade_ 
