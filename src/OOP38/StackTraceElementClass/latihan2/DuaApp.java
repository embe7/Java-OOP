package OOP38.StackTraceElementClass.latihan2;

public class DuaApp {
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
                    "TI_M1803"
            };

            System.out.println(data[10]);
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }
}
