import Car.PetrolCar;
import CarParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar petrolCar;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.5, 160);
        customer = new Customer("James", 32, 64000);
        petrolCar = new PetrolCar("Ford", "Ranger", "Red", 27500);
    }

    @Test
    public void hasName() {
        assertEquals("James", customer.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(32, customer.getAge());
    }

    @Test
    public void hasCash() {
        assertEquals(64000, customer.getCash(), 0.0);
    }

    @Test
    public void hasNoCar() {
        assertEquals(null, customer.getCar());
    }


}
