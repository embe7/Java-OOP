package OOP25.DefaultMethod;

public class Bus implements Car {
    @Override
    public String drive() {
        return "dRIVE";
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public boolean isBig() {
        return true;
    }

    @Override
    public String brand() {
        return "Mitsubisi";
    }

    @Override
    public boolean isMaintenance() {
        return true;
    }
}
