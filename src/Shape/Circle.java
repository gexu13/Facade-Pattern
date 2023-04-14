package Shape;

/**
 * This class represents a circle. It offers all the operations mandated by the Shape interface.
 */

public class Circle implements Shape{
  private int diameter;

  /**
   * Construct a circle object with given diameter.
   *
   * @param diameter the diameter of a circle
   */

  public Circle(int diameter) {
    this.diameter = diameter;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle.");
  }

  @Override
  public double calculatePerimeter() {
    return Math.round(Math.PI * diameter);
  }

  @Override
  public double calculateArea() {
    return Math.round(Math.PI * Math.pow(diameter, 2) / 4);
  }
}