package bikeproject;

public interface MountainParts {
  String TERRAIN = "off_road"; // Константа для типа местности

  // Методы для работы с подвеской и типом
  void setSuspension(String newValue);

  String getSuspension();

  void setType(String newValue);

  String getType();
}
