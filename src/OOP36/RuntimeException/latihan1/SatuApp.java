package OOP36.RuntimeException.latihan1;

public class SatuApp {
    public static void main(String[] args) {
        LoginRequestSatu data = new LoginRequestSatu("suhendri",null);


        try {
            RuntimeExceptionSatu.validateRuntime(data);
            System.out.println("Sukses");
        }catch (RuntimeException e){
            System.out.println("Data tidak valid : " + e.getMessage());
        }finally {
            System.out.println("selalu di jalankan");
        }
    }
}
