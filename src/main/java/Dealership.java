import Car.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private double till;

    public Dealership(double till) {
        this.cars = new ArrayList<>();
        this.till = till;
    }

    public int getNumberOfCars() {
        return this.cars.size();
    }

    public double getTill() {
        return this.till;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

}
