package Car;

import CarParts.Engine;
import CarParts.Entry;
import CarParts.GearBox;
import CarParts.MediaPlayer;
import CarParts.Types.TyreType;

import org.junit.Before;
import org.junit.Test;

import static CarParts.Types.EngineType.INLINE;
import static CarParts.Types.EntryType.KEYLESS;
import static CarParts.Types.GearType.MANUAL;
import static org.junit.Assert.assertEquals;


public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
//    TyreType tyreType;
//    MediaPlayer mediaPlayer;
//    GearBox gearBox;
//    Entry entry;


    @Before
    public void before() {
        engine = new Engine(1.2, 95);
//        Engine Engine = null;
//        entry = new Entry(KEYLESS);
//        Entry Entry = null;
//        GearBox gearBox = null;
        petrolCar = new PetrolCar("Ford", "Focus", "Silver", 12500);
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", petrolCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Focus", petrolCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", petrolCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(12500, petrolCar.getPrice());
    }
    @Test
    public void hasLitres() {
        assertEquals(1.2, engine.getLitres(), 0.1);
    }

    @Test
    public void hasHp() {
        assertEquals(95, engine.getHp());
    }

//    @Test
//    public void hasEngineType() {
//        assertEquals(INLINE, petrolCar.getEngine());
//    }
//    @Test
//    public void hasEntry() {
//        assertEquals(KEYLESS, petrolCar.getEntry());
//    }

//    @Test
//    public void hasGearBox() {
//        assertEquals(MANUAL, petrolCar.getGearBox());
//    }
}
