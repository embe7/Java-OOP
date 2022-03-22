package OOP37.Errorr.latihan2;

public class DuaApp {
    public static void main(String[] args) {

        connectDatabase("suhendri","rahasia");
        System.out.println("sukses");

    }
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new Error("Tidak bisa terkoneksi ke database");
        }
    }
}
