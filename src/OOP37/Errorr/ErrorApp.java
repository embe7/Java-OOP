package OOP37.Errorr;

/**
 * Error
 * - Error adalah jenis exception yang terakhir
 * - Error adalah sebuah class di java, yang tidak direkomendasikan untuk di try-catch
 * - Biasanya Error terjadi apabila ada masalah serius, dan sangat tidak direkomendasikan untuk di try-catch
 * - Artinya direkomendasika untuk mematikan aplikasi
 * - Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat
 *   exception jenis error, dan menghentikan aplikasi
 *
 * note : exception jenis Error tidak disarankan untuk di tangkap atau di try catch
 */

public class ErrorApp {
    public static void main(String[] args) {

        connectDatabase("admin",null);

    }
    public static void connectDatabase(String username,String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa koneksi ke database");
        }
    }
}
