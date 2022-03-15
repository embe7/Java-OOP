package OOP40.Annotation;

/**
 * ==== Annotation ====
 * - Anottation adalah menambahkan metadata ke kode program yang kita buat
 * - Tidak semua orang membutuhkan annotation, biasanya annotation digunakan saat kita ingin membuat library/framework
 * - annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
 * - untuk membuat annotation, kita bisa menggunkan kata kunci @interface
 * - annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 *
 * ==== Atribut Annotation ====
 * - @Target = memberitahu annotation bisa digunakan dimana? class, method, field, dan lain-lain
 * - @Retention = memberitahu annotation apakah disimpan di hasil kompilasi, dan apakan bisa dibaca oleh reflection?
 *
 * ==== Predefined Annotation ====
 * Java sudah memiliki annotation bawaan, seperti :
 * - @Override, untuk menandai bahwa method yang meng-override method parent class nya
 * - @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
 * - @Functionallinterface, untuk menandai bahwa class tersebut bisa dibuat sebgai lambda expression
 * - dan lain-lain
 */

@Fancy(name = "Data",tags = {"Suhendri","18110460","TI-M1803"})

public class AnnotationApp {

    @Fancy(name = "Animals", tags = {"Kura-kura","Anjing","sapi"})

    public static void main(String[] args) {

    }
}
