package Car;

import CarParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.3, 200);
        hybridCar = new HybridCar("BMW", "3 Series", "Black", 36500);
    }

    @Test
    public void hasMake() {
        assertEquals("BMW", hybridCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("3 Series", hybridCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", hybridCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(36500, hybridCar.getPrice());
    }

    @Test
    public void hasLitres() {
        assertEquals(1.3, engine.getLitres(), 0.0);
    }

    @Test
    public void hasHp() {
        assertEquals(200, engine.getHp());
    }
}
