package Shape;

/**
 * This class represents a shape manager. It serves as a facade to delegate user calls
 * to concrete classes.
 */

public class ShapeManager {
  private Shape triangle;
  private Shape rectangle;
  private Shape circle;

  /**
   * Construct a ShapeManager facade with given objects of concrete classes.
   */

  public ShapeManager() {
    triangle = new Triangle(3, 7);
    rectangle = new Rectangle(4, 5);
    circle = new Circle(2);
  }

  /**
   * delegate user call of drawing a triangle to class Triangle.
   */

  public void drawTriangle() {
    triangle.draw();
  }

  /**
   * delegate user call of drawing a rectangle to class Rectangle.
   */

  public void drawRectangle() {
    rectangle.draw();
  }

  /**
   * delegate user call of drawing a circle to class Circle.
   */

  public void drawCircle() {
    circle.draw();
  }

  /**
   * delegate user call of calculating the perimeter of a triangle to class Triangle.
   *
   * @return the perimeter of this triangle
   */

  public String calculateTrianglePerimeter() {
    return String.format("The triangle has a perimeter of %.1f.", triangle.calculatePerimeter());

  }

  /**
   * delegate user call of calculating the area of a triangle to class Triangle.
   *
   * @return the area of this triangle
   */


  public double calculateTriangleArea() {
    return triangle.calculateArea();
  }

  /**
   * delegate user call of calculating the perimeter of a rectangle to class Rectangle.
   *
   * @return the perimeter of this rectangle
   */

  public double calculateRectanglePerimeter() {
    return rectangle.calculatePerimeter();
  }

  /**
   * delegate user call of calculating the area of a rectangle to class Rectangle.
   *
   * @return the area of this rectangle
   */

  public double calculateRectangleArea() {
    return rectangle.calculateArea();
  }

  /**
   * delegate user call of calculating the perimeter of a circle to class Circle.
   *
   * @return the perimeter of this circle
   */

  public double calculateCirclePerimeter() {
    return circle.calculatePerimeter();
  }

  /**
   * delegate user call of calculating the area of a circle to class Circle.
   *
   * @return the area of this circle
   */

  public double calculateCircleArea() {
    return circle.calculateArea();
  }
}
