public class Car {
    String color;
    String engine;
    int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void swapColors(Car otherCar) {
        String temp = this.color;
        this.color = otherCar.color;
        otherCar.color = temp;
    }
}
class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Blue", "V6", 4);
        Car car2 = new Car("Red", "V8", 2);

        System.out.println("Car 1:");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Мотор: " + car1.getEngine());
        System.out.println("Количество дверей: " + car1.getNumberOfDoors());

        System.out.println("\nCar 2:");
        System.out.println("Цвет: " + car2.getColor());
        System.out.println("Мотор: " + car2.getEngine());
        System.out.println("Количество дверей: " + car2.getNumberOfDoors());

        car1.setNumberOfDoors(5);
        car2.setNumberOfDoors(4);

        car1.swapColors(car2);

        System.out.println("\nCar 1:");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Мотор: " + car1.getEngine());
        System.out.println("Количество дверей: " + car1.getNumberOfDoors());

        System.out.println("\nCar 2:");
        System.out.println("Цвет: " + car2.getColor());
        System.out.println("Мотор: " + car2.getEngine());
        System.out.println("Количество дверей: " + car2.getNumberOfDoors());
    }
}