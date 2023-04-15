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
    ShapeManager shapeManager = new ShapeManager(4.0, 5.0,
        6.0,7.0,8.0);

    shapeManager.drawTriangle();
    shapeManager.drawRectangle();
    shapeManager.drawCircle();

    double trianglePerimeter;
    double triangleArea;
    double rectanglePerimeter;
    double rectangleArea;
    double circlePerimeter;
    double circleArea;

    //System.out.println(shapeManager.calculateTrianglePerimeter());

  }
}
