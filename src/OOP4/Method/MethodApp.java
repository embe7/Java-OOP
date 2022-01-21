package OOP4.Method;

/**
 * Method
 * - Selain menambahkan field kita juga bisa menambahkan method ke dalam class
 * - caranya dengan mendeklarasikan method tersebut ke dalam class
 * - sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading
 *   di method yang ada di dalam block class
 * - untuk mengakses method tersebut kita bisa menggunkan tanda titik (.) dan diikuti dengan nama method nya
 */

public class MethodApp {
    public static void main(String[] args) {
        //object
        Student data = new Student();

        data.sayHello("Suhendri");
        data.sayNilai(60,70,50,90,80);
    }
}
