package facadepattern;

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
        6.0, 7.0, 8.0);

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
