package OOP32.AnonymousClass;

/**
 * Anonymous Class
 * - Anonymous class atau class tanpa nama
 * - adalah kemampuan mendeklarasikan class, sekaligus meng-intasnsiasi object-nya secara langsung
 * - anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana
 *   kita membuat anonymous class tersebut
 * - anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface
 *   atau abstrack class sederhana, tanpa harus membuat implementasi class nya
 */

public class AnonymousClassApp {
    public static void main(String[] args) {
        HelloWord english = new HelloWord() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println(name);
            }
        };

        HelloWord indonesia = new HelloWord() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println(name);
            }
        };

        english.sayHello();
        english.sayHello("Suhendri");

        indonesia.sayHello();
        indonesia.sayHello("Fahri Abizar");
    }
}
