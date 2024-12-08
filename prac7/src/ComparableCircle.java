public class ComparableCircle extends Circle {

  public ComparableCircle(double radius) {
    super(radius);
  }

  @Override
  public int compareTo(GeometricObject o) {
    // Сравниваем площади
    if (o instanceof ComparableCircle) {
      return Double.compare(this.getArea(), ((ComparableCircle) o).getArea());
    }
    return super.compareTo(o); // Используем сравнение, если o — не ComparableCircle
  }

  @Override
  public String toString() {
    return "ComparableCircle: радиус = " + getRadius() + ", площадь = " + getArea();
  }
}
