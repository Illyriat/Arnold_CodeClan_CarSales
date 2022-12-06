package Car;

import CarParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine((double) 0, 229);
        electricCar = new ElectricCar("Kia", "EV6", "Blue", 45245);
    }

    @Test
    public void hasMake() {
        assertEquals("Kia", electricCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("EV6", electricCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(45245, electricCar.getPrice());
    }

    @Test
    public void hasLitres() {
        assertEquals(0, engine.getLitres(), 0.0);
    }

    @Test
    public void hasHp() {
        assertEquals(229, engine.getHp());
    }
}

