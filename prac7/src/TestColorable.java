public class TestColorable {
  public static void main(String[] args) {
    // Создаём объекты
    GeometricObject[] objects = new GeometricObject[5];

    objects[0] = new Circle(5); // Круг
    objects[1] = new Rectangle(4, 6); // Прямоугольник
    objects[2] = new Square(3); // Квадрат
    objects[3] = new Square(2); // Квадрат
    objects[4] = new Circle(7); // Круг

    // Для каждого объекта в массиве
    for (GeometricObject object : objects) {
      System.out.println(object.toString());
      System.out.println("Площадь: " + getArea(object));

      // Если объект реализует интерфейс Colorable, вызываем метод howToColor()
      if (object instanceof Colorable) {
        ((Colorable) object).howToColor();
      }
      System.out.println(); // Пустая строка для разделения
    }
  }

  // Метод для получения площади объекта
  public static double getArea(GeometricObject object) {
    if (object instanceof Circle) {
      return ((Circle) object).getArea();
    } else if (object instanceof Rectangle) {
      return ((Rectangle) object).getArea();
    } else if (object instanceof Square) {
      return ((Square) object).getArea();
    }
    return 0;
  }
}
