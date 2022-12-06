package CarParts;

import CarParts.Types.EngineType;

public class Engine {

    private int hp;
    private double litres;
    private EngineType engineType;

    public Engine(Double litres, int hp) {
        this.litres = litres;
        this.hp = hp;
        this.engineType = getEngineType();
    }

    public double getLitres() {
        return litres;
    }

    public int getHp() {
        return hp;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
