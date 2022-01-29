package OOP7.ThisKeyword;

/**
 * This Keyword
 * - saat kita membuat code dalam block constructor atau method di dalam class, kita bisa menggunakan
 *   kata kunci this untuk mengakses object saat ini
 * - misalnya saat kita mau mengakses sebuah field yang namanya sama dengan parameter yang ada di method
 *   hal ini tidak bisa dilakukan bila langsung menyebut nama field, kita bisa melakukannya dengan kata kunci this
 * - this tidak hanya bisa digunakan untuk mengakses field saat ini, namun bisa digunakan untuk mengakses
 *   method, this bisa untuk mengatasi variabel shadowing
 */

public class ThisKeywordApp {
    public static void main(String[] args) {
        Person person = new Person("Suhendri",18110460);

        person.sayHello("Bambang ");

        person.sayHello();
    }
}
