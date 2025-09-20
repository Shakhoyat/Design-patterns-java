// BRIDGE: Separates abstraction from implementation

// Implementation interface
interface Color {
    void applyColor();
}

// Concrete implementations
class Red implements Color {
    public void applyColor() {
        System.out.println("Red color");
    }
}

class Blue implements Color {
    public void applyColor() {
        System.out.println("Blue color");
    }
}

// Abstraction
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Refined abstraction
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Circle with ");
        color.applyColor();
    }
}

// Usage
public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueCircle = new Circle(new Blue());

        redCircle.draw(); // Circle with Red color
        blueCircle.draw(); // Circle with Blue color
    }
}