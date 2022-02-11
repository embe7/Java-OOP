package OOP9.MethodOverriding;

/**
 * Method Overriding
 * - adalah kemampuan mendeklarasikan ulang method di class child yang sudah ada di class parent
 * - saat kita melakukan overriding tersebut, secara otomatis saat kita membuat object dari class child,
 *   method di class parent tidak bisa di akses lagi
 */

public class MethodOverridingApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Suhendri";
        manager.sayHello("Budi");

        VicePresident vp = new VicePresident();
        vp.name = "Tralala";
        vp.sayHello("Putri");
    }
}
