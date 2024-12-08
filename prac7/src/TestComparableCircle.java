public class TestComparableCircle {
  public static void main(String[] args) {
    ComparableCircle circle1 = new ComparableCircle(5);
    ComparableCircle circle2 = new ComparableCircle(3);

    System.out.println("Сравнение кругов:");
    System.out.println("Круг 1: " + circle1);
    System.out.println("Круг 2: " + circle2);

    if (circle1.compareTo(circle2) > 0) {
      System.out.println("Круг 1 больше.");
    } else if (circle1.compareTo(circle2) < 0) {
      System.out.println("Круг 2 больше.");
    } else {
      System.out.println("Круги равны.");
    }
  }
}
