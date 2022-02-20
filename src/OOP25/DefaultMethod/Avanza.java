package OOP25.DefaultMethod;

public class Avanza implements Car {

    @Override
    public String drive() {
        return "Drive";
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public boolean isBig() {
        return false;
    }

    @Override
    public String brand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return true;
    }
}
