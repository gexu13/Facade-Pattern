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
    String s = String.format("Drawing a circle...with its diameter of %d.", diameter);
    System.out.println(s);
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
