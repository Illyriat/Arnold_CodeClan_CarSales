package Car;

import CarParts.Engine;
import CarParts.Entry;


public abstract class Car {

    private String make;
    private String model;
    private String colour;
    private double price;
    private String engine;
    private Entry entry;

    public Car(String make, String model, String colour, double price) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
//        this.entry = entry;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() { return colour; }

    public double setPrice(double price) {
        return price;
    }

    public Engine getEngine() {
        return getEngine();
    }

    public int getPrice() {
        return (int) price;
    }
}
