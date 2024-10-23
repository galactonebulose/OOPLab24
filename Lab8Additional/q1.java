package LabExercises.Lab8Additional;

// Abstract class Shape
abstract class Shape {
  // Abstract method to calculate area
  abstract void calculateArea();
}

// Class for Square that extends Shape
class Square extends Shape {
  double side;

  // Constructor to initialize the side of the square
  Square(double side) {
      this.side = side;
  }

  // Implementation of calculateArea for Square
  @Override
  void calculateArea() {
      double area = side * side;
      System.out.println("Area of the Square: " + area);
  }
}

// Class for Triangle that extends Shape
class Triangle extends Shape {
  double base, height;

  // Constructor to initialize base and height of the triangle
  Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  // Implementation of calculateArea for Triangle
  @Override
  void calculateArea() {
      double area = (base * height) / 2;
      System.out.println("Area of the Triangle: " + area);
  }
}

// Main class to test the program
public class q1 {
  public static void main(String[] args) {
      // Create a Square object
      Square square = new Square(4.0);
      square.calculateArea();  // Output: Area of the Square: 16.0

      // Create a Triangle object
      Triangle triangle = new Triangle(5.0, 3.0);
      triangle.calculateArea();  // Output: Area of the Triangle: 7.5
  }
}

