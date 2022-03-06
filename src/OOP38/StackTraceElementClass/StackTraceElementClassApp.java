package OOP38.StackTraceElementClass;

/**
 * StackTraceElemnt Class
 * - Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan array dari StackTrceElement object
 * - StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
 * - Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
 * - Cara paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console
 *   detail error StackTraceElement nya
 */

public class StackTraceElementClassApp {
    public static void main(String[] args) {

        try {
            String[] data = {
                    "suhendri", "18110460","TI-M1803"
            };
            System.out.println(data[10]);
        }catch (Throwable e){
            StackTraceElement[] stackTraceElements = e.getStackTrace();

            e.printStackTrace();
        }

        //test print method sample error

        try {
            sampleError();
        }catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
        }
    }
    public static void sampleError(){
        try {
            String[] students = {
                    "Fahri Abizar", "18110355","TI-M1803"
            };
            System.out.println(students[100]);
        }catch (Throwable e){
            throw new RuntimeException(e);
        }
    }
}
