package OOP38.StackTraceElementClass.latihan1;

public class SatuApp {
    public static void main(String[] args) {

        try {
            sampleError();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
    public static void sampleError(){
        try {
            String[] data = {
                    "suhendri",
                    "18110460",
                    "TI-M1803"
            };

            System.out.println(data[100]);
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }
}
