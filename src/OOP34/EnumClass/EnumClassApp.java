package OOP34.EnumClass;

public class EnumClassApp {
    public static void main(String[] args) {
        Customer pembeli = new Customer();

        pembeli.setName("Suhendri");
        pembeli.setLevelCustomers(Level.VIP);

        System.out.println(pembeli.getName());
        System.out.println(pembeli.getLevelCustomers());
        System.out.println(pembeli.getLevelCustomers().getDescriptions());

        //konversi Enum ke String
        String level = Level.VIP.name();
        System.out.println(level);

        Level level1 = Level.valueOf("STANDARD");
        System.out.println(level1);

        //mengecek isi enum
        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }

    }
}
