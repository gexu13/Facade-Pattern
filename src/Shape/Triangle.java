package Shape;

/**
 * This class represents a triangle. It offers all the operations mandated by the Shape interface.
 */
public class Triangle implements Shape{
private int base;
private int height;

  /**
   * Construct a triangle object with given base and height.
   *
   * @param base the base of a triangle
   * @param height the height of a triangle
   */

public Triangle(int base, int height) {
  this.base = base;
  this.height = height;
}

@Override
  public void draw() {
  String s = String.format("Drawing a triangle...with its base of %d and height of %d.", base, height);
  System.out.println(s);
}

@Override
  public double calculatePerimeter() {
  double side;
  side = Math.sqrt(Math.pow(height, 2) + Math.pow(0.5 * base, 2));
  return Math.round(2 * side + base);
}

@Override
  public double calculateArea() {
  return Math.round(0.5 * base * height);
}
}
