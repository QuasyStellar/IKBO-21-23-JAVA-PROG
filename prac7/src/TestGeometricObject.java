public class TestGeometricObject {
  public static void main(String[] args) {
    GeometricObject circle1 = new Circle(5);
    GeometricObject circle2 = new Circle(3);

    GeometricObject rectangle1 = new Rectangle(4, 6);
    GeometricObject rectangle2 = new Rectangle(5, 5);

    System.out.println("Наибольший круг: " + GeometricObject.max(circle1, circle2).toString());
    System.out.println(
        "Наибольший прямоугольник: " + GeometricObject.max(rectangle1, rectangle2).toString());
  }
}
