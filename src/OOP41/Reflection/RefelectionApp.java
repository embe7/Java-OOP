package OOP41.Reflection;

/**
 * Reflection
 * - Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
 * - Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework,
 *   sehingga bisa meng-otomatisasi pekerjaan
 * - untuk mengakses reflection class dari sebuah object, kita bisa menggunkan method getClass()
 *   atau NamaClass.class
 */

public class RefelectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("suhendri");
        request.setPassword("rahasia");

        ValidationUtil.validationReflectin(request);
    }
}
