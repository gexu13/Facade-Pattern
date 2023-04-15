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

    double trianglePerimeter = shapeManager.calculateTrianglePerimeter();
    System.out.println(String.format("Triangle Perimeter: %.2f", trianglePerimeter));

    double triangleArea = shapeManager.calculateTriangleArea();
    System.out.println(String.format("Triangle Area: %.2f", triangleArea));

    double rectanglePerimeter = shapeManager.calculateRectanglePerimeter();
    System.out.println(String.format("Rectangle Perimeter: %.2f", rectanglePerimeter));

    double rectangleArea = shapeManager.calculateRectangleArea();
    System.out.println(String.format("Rectangle Area: %.2f%n", rectangleArea));

    double circlePerimeter = shapeManager.calculateCirclePerimeter();
    System.out.println(String.format("Circle Perimeter: %.2f", circlePerimeter));

    double circleArea = shapeManager.calculateCircleArea();
    System.out.println(String.format("Circle Area: %.2f", circleArea));

  }
}
