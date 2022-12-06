package Car;

import CarParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    DieselCar dieselCar;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(2.0, 120);
        dieselCar = new DieselCar("Skoda", "Octavia", "Black", 35000);
    }

    @Test
    public void hasMake() {
        assertEquals("Skoda", dieselCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Octavia", dieselCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", dieselCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(35000, dieselCar.getPrice());
    }
    @Test
    public void hasLitres() {
        assertEquals(2.0, engine.getLitres(), 0.1);
    }

    @Test
    public void hasHp() {
        assertEquals(120, engine.getHp());
    }
}
