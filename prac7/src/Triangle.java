public class Triangle extends GeometricObject {
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;

  /** Конструктор по умолчанию */
  public Triangle() {
    super();
  }

  /** Конструктор с указанными сторонами */
  public Triangle(double side1, double side2, double side3) {
    super();
    if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
      throw new IllegalArgumentException("Стороны не удовлетворяют правилу треугольника.");
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  /** Возвращает первую сторону */
  public double getSide1() {
    return side1;
  }

  /** Возвращает вторую сторону */
  public double getSide2() {
    return side2;
  }

  /** Возвращает третью сторону */
  public double getSide3() {
    return side3;
  }

  /** Возвращает площадь треугольника */
  @Override
  public double getArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /** Возвращает периметр треугольника */
  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  /** Возвращает строковое представление объекта */
  @Override
  public String toString() {
    return "Треугольник: сторона1 = "
        + side1
        + ", сторона2 = "
        + side2
        + ", сторона3 = "
        + side3
        + ", цвет = "
        + getColor()
        + ", заливка = "
        + isFilled();
  }
}
