package OOP33.StaticKeyword.StaticBlok;

public class StaticBlok {
    public static final int PROCCESORS;

    static {
        System.out.println("Mengakses Aplikasi");
        PROCCESORS = Runtime.getRuntime().availableProcessors();
    }
}
