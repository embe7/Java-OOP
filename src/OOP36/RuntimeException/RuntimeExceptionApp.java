package OOP36.RuntimeException;

import OOP35.Exception.LoginRequest;

/**
 * ==== Jenis Exception ====
 * Secara garis besar, di java, exception dibagi menjadi 3 jenis
 * - Checked exception, yaitu exception yang wajib di try catch, seperti pada latihan35 sebelumnya
 * - Runtime exception, dan
 * - Error (Yang akan dibahas selanjutnya)
 *
 * ==== Runtime Exception
 * - runtime exception adalah jenis exception yang tidak wajib ditangkap mengunakan try catch
 * - complier java tidak akan perotes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang
 *   bisa menyebabkan runtime exception
 * - untuk membuat class runtime exception, kita wajib mengextends class runtime exception
 * - ada banyak di java yang merupakan runtime exception, eperti nullpointerexception, IllegalArgumenException, dll
 *
 * - Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakuka try-catch
 * - karena jika terjadi runtime exception, yang ditakutkan adalah program kita akan berhenti
 */

public class RuntimeExceptionApp {
    public static void main(String[] args) {
        LoginRequest loginRequest2 = new LoginRequest("suhendri",null);

        try {
            ValidationUtil.validation(loginRequest2);
            System.out.println("Success");
        }catch (NullPointerException | BlankException e){
            System.out.println("Gagal : " + e.getMessage());
        }finally {
            System.out.println("Aplikasi");
        }
    }
}
