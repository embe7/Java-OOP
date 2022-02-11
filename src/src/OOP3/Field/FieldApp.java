package OOP3.Field;

/**
 * Field
 * - Fields/Properties/Atribut adalah data yang bisa kita sisipkan di dalam object
 * - namun sebelum kita bisa memasukan data di fields, kita harus mendeklarasikn data apa saja yang dimiki
 *   object tersebut di dalam deklarasi class nya
 * - membuat field sama dengan membuat variabel, namun di tempatkan di dalam block class
 */

public class FieldApp {
    public static void main(String[] args) {

        Animals animal = new Animals();
        animal.name = "Kura-Kura";
        animal.habitat = "Sungai dan Danau";

        System.out.println(animal.name);
        System.out.println(animal.habitat);
    }
}
