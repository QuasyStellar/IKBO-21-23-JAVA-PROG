package bikeproject;

public interface RoadParts {
  String TERRAIN = "track_racing"; // Константа для типа местности

  // Методы для работы с шинами и высотой поста
  void setTyreWidth(String newValue);

  String getTyreWidth();

  void setPostHeight(String newValue);

  String getPostHeight();
}
