package OOP23.Interface;

/**
 * Interface
 * - sebelumnya kita sudah tau bahwa abstrak class bisa kita gunakan sebagai kontrak untuk class chill nya
 * - namun sebenarnya yang lebih tepat untuk kontrak adalah interface
 * - jangan salah sangka interface disini bukanlah user interface
 * - interface mirip seperti abstrak class, yang membedaan adalah di interface, semua method otomatis abstrak,
 *   tidak memiliki blok
 * - di interface kita tidak boleh memiliki field, kita hanya bisa memiliki constant(field yang tidak bisa diubah)
 * - untuk mewariskan interface, kita tidak menggunakan kata kunci extend, melaikan implements
 * - semua method yang ada di interface wajib di override semua di class turunannya
 */

public class InterfaceApp {
    public static void main(String[] args) {
        Avanza tipe1 = new Avanza();

        tipe1.drive();
        System.out.println(tipe1.getTire());
    }
}
