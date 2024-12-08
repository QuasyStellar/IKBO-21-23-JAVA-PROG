public class Square extends GeometricObject implements Colorable {
  private double side;

  // Безаргументный конструктор
  public Square() {
    this.side = 0;
  }

  // Конструктор с указанием стороны
  public Square(double side) {
    this.side = side;
  }

  // Геттер для стороны
  public double getSide() {
    return side;
  }

  // Сеттер для стороны
  public void setSide(double side) {
    this.side = side;
  }

  // Площадь квадрата
  public double getArea() {
    return side * side;
  }

  // Периметр квадрата
  public double getPerimeter() {
    return 4 * side;
  }

  // Реализация метода howToColor() из интерфейса Colorable
  @Override
  public void howToColor() {
    System.out.println("Раскрасьте все четыре стороны.");
  }

  @Override
  public String toString() {
    return "Square with side " + side;
  }
}
