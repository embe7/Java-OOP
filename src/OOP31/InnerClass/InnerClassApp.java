package OOP31.InnerClass;

/**
 * ==== Inner Class ====
 * - di java, kita bisa membuat class di dalam class, atau disebut dengan inner class
 * - salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class
 *   yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
 * - misal kita perlu membuat class Employe  sebagai inner class company
 * - cara membuat inner class, cukup membuatnya di dalam blok clas outer class nya
 *
 * ==== Mengakses Outer class ====
 * - keuntungan saat kita membuat inner class adalah, kemempuan utuk mengakses outer class nya
 * - inner class bisa membaca semua private member yang ada di outer class nya
 * - untuk mengakses object outer class nya, kita bisa menggunakan nama clas outernya, diikuti kata kunci this,
 *   misalnya Company.this
 * - dan untuk mengakses super class outer class nya, kita biasa menggunakan nama class outernya diikuti kata kunci
 *   super, misalnya Company.Super
 */

public class InnerClassApp {
    public static void main(String[] args) {
        Company DataCompany = new Company();
        DataCompany.setName("PT.Indomarco Prismatama");

        Company.Employe DataEmploye = DataCompany.new Employe();
        DataEmploye.setName("Suhendri");

        System.out.println(DataEmploye.getName());
        System.out.println(DataEmploye.getCompany());

    }
}
