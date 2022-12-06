import Car.Car;

public class Customer {

    private String name;
    private int age;
    private double cash;
    private Car car;

    public Customer(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCash() {
        return cash;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
