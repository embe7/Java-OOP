package OOP25.DefaultMethod;

public interface Car extends Maintenance,HasBrand{
    String drive();
    int getTire();

    public default boolean isBig(){
        return true;
    }
}
