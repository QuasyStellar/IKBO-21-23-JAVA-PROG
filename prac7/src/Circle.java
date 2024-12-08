public class Circle extends GeometricObject {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double getDiameter() {
    return 2 * radius;
  }

  @Override
  public String toString() {
    return "Круг с радиусом " + radius + " и площадью " + getArea();
  }

  public void printCircle() {
    System.out.println("Круг создан " + getDateCreated() + " и радиус равен " + radius);
  }
}
