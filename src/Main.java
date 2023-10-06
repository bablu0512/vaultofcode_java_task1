class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void start() {
        System.out.println("Starting the car.");
    }

    public void stop() {     // we should create a method stop in the publivvoid before declaring it
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();       //method is derived from the line 12
    }
}

