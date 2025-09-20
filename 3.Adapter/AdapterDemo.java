// Target
interface Railroad {
    void vehicleMoving();
}

// Adaptee (the class we want to adapt)
class Car {
    public void drive() {
        System.out.println("Car is driving on the road.");
    }
}

// Adapter class implementing the Target interface
class Adapter implements Railroad {
    private Car car;

    public Adapter(Car car) {
        this.car = car;
    }

    @Override
    public void vehicleMoving() {
        System.out.println("Adapter converts railroad movement to car driving.");
        car.drive();
    }
}

// Another implementation of Railroad (for comparison)
class Train implements Railroad {
    @Override
    public void vehicleMoving() {
        System.out.println("Train is moving on the railroad tracks.");
    }
}

// Client code
public class AdapterDemo {
    public static void main(String[] args) {
        // Direct use of Train
        Railroad train = new Train();
        System.out.println("Using Train:");
        train.vehicleMoving();

        // Using Car via Adapter
        Car car = new Car();
        Railroad railroad = new Adapter(car);
        System.out.println("\nUsing Car via Adapter:");
        railroad.vehicleMoving();
    }
}