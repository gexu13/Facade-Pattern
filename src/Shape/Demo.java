package Shape;

/**
 * This is a demo class that interacts with ShapeManager interface.
 */

public class Demo {

  /**
   * Run a ShapeManager facade.
   *
   * @param args not used
   */

  public static void main(String[] args) {
    ShapeManager shapeManager = new ShapeManager();

    shapeManager.drawTriangle();
    shapeManager.drawRectangle();
    shapeManager.drawCircle();

    double trianglePerimeter;
    double triangleArea;
    double rectanglePerimeter;
    double rectangleArea;
    double circlePerimeter;
    double circleArea;

    System.out.println(shapeManager.calculateTrianglePerimeter());

  }
}
