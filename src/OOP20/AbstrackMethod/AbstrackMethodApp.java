package OOP20.AbstrackMethod;

/**
 * Abstract Method
 * - Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class
 *   abstract tersebut
 * - saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut
 * - Artinya, abstract method wajib di override di class child
 * - abstract method tidak bleh memiliki access modifier private
 *
 * - turunan dari class parent wajib meng-override method abstract
 */

public class AbstrackMethodApp {
    public static void main(String[] args) {
        Product data = new Product("Lenovo",5_000_000);
        data.print();
    }

}
