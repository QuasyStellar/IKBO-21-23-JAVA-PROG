public abstract class GeometricObject implements Comparable<GeometricObject> {
  private String color = "белый";
  private boolean filled;
  private java.util.Date dateCreated;

  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  public GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    dateCreated = new java.util.Date();
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  public double getDiameter() {
    return 0;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "создан " + dateCreated + ",\nцвет: " + color + ", заливка: " + filled;
  }

  @Override
  public int compareTo(GeometricObject other) {
    double thisArea = this.getArea();
    double otherArea = other.getArea();
    if (thisArea < otherArea) {
      return -1;
    } else if (thisArea > otherArea) {
      return 1;
    } else {
      return 0;
    }
  }

  public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
    return obj1.getArea() > obj2.getArea() ? obj1 : obj2;
  }
}
