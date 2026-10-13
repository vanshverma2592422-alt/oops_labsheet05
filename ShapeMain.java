package labsheet05.question18;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    public void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            shape.displayShapeName();
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area: " + circle.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area: " + rectangle.calculateArea());
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 4.0),
            new Rectangle("Rectangle", 5.0, 3.0)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}