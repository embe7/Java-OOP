package OOP37.Errorr.latihan1;

public class SatuApp {
    public static void main(String[] args) {

        connectDatabase("suhendri",null);
        System.out.println("sukses");

    }
    public static void connectDatabase(String username,String password){
        if (username == null || password == null){
            throw new DataBaseErrorSatu("Tidak bisa koneksi ke Database");
        }
    }
}
