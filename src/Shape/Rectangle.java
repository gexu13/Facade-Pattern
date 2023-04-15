package Shape;

/**
 * This class represents a rectangle. It offers all the operations mandated by the Shape interface.
 */

public class Rectangle implements Shape{
  private int length;
  private int width;

  /**
   * Construct a rectangle object with given length and width.
   *
   * @param length the length of a rectangle
   * @param width the width of a rectangle
   */

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public void draw() {
    String s = String.format("Drawing a rectangle...with its length of %d and width of %d.", length, width);
    System.out.println(s);
  }

  @Override
  public double calculatePerimeter() {
    return Math.round(2 * length + 2 * width);
  }

  @Override
  public double calculateArea() {
    return Math.round(length * width);
  }
}
