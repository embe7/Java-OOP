package OOP5.Constructor;

/**
 * Constructor
 * - Di dalam class java kita bisa membuat constructor, constructor adalah method yang pertama kali dipanggil
 *   saat pertama kali pembuatan object
 * - mirip seperti di method kita bisa memberi parameter pada constructor
 * - nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
 */

public class ConstructorApp {
    public static void main(String[] args) {

        Students student = new Students("Suhendri",18110460);

        System.out.println(student.name);
        System.out.println(student.NPM);
        System.out.println(student.Address);
    }
}
