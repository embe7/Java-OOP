package OOP35.Exception.latihan2;

public class DuaApp {
    public static void main(String[] args) {
        DataRequest data = new DataRequest("suhendri","18110460","TI-M1803");

        try {
            ValidationUtilDua.validation(data);
            System.out.println("Data Valid");
        }catch (ValidationExceptionDua | NullPointerException e){
            System.out.println("Data Tidak Valid : " + e.getMessage());
        }finally {
            System.out.println("selalu di eksekusi");
        }
    }
}
