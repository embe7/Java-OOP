package OOP11.SuperConstructor;

/**
 * Super Constructor
 * - tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci
 *   super juga bisa diguakan untuk mengakses constructor
 * - namun syaratnya untuk mengakses parent class constructor, kita hharus mengakses nya di dalam
 *   class child constructor
 * - jika sebuah class parent tidak memiliki constructor yang tidak ada parent nya( tidak memiliki
 *   default constructor), maka class child wajib mengakses  constructor class parent tersebut
 */

public class SuperConstructorApp {
    public static void main(String[] args) {

        Manager manager = new Manager("Suhendri",null);
        manager.sayHello();

        VicePresident vp = new VicePresident("Alwi");
        vp.sayHello();
    }
}
