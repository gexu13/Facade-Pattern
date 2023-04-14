package Shape;

/**
 * This interface contains all operations that all types of shapes should support.
 */
public interface Shape {
  /**
   * Draws a shape.
   */
  void draw();

  /**
   * Computes and returns the perimeter of this shape.
   *
   * @return the perimeter of this shape
   */
  int calculatePerimeter();

  /**
   * Computes and returns the area of this shape.
   *
   * @return  the area of this shape
   */
  double calculateArea():
}
