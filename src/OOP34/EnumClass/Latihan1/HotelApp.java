package OOP34.EnumClass.Latihan1;

import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {
        Scanner InputData = new Scanner(System.in);
        DataCustomers customers = new DataCustomers();

        System.out.println("....::Menu::....");

        System.out.print("Input Nama :");
        customers.setDataNama(InputData.next());

        System.out.println("Kelas yang tersedia");
        for (var value : HotelKelas.values()){
            System.out.println(value);
        }

        System.out.print("Input kelas :");
        customers.setLevel(HotelKelas.valueOf(InputData.next()));

        System.out.println(customers.getDataNama());
        System.out.println(customers.getLevel().getDescriptions());


    }
}
