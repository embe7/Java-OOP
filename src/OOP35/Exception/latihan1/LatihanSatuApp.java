package OOP35.Exception.latihan1;

public class LatihanSatuApp {
    public static void main(String[] args) {
        LoginRequestSatu data = new LoginRequestSatu("suhendri","rahasia");

        try {
            ValidationUtilSatu.validation(data);
            System.out.println("Data Valid");
        }catch (ValidationExceptionSatu e){
            System.out.println("Data Tidak Valid : " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Data null : " + e.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
