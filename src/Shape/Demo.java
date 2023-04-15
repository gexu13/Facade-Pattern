package Shape;

public class Demo {
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
