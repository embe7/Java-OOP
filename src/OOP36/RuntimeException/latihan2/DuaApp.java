package OOP36.RuntimeException.latihan2;

public class DuaApp {
    public static void main(String[] args) {

        AnimalRequestDua animal = new AnimalRequestDua("Kura-Kura","Danau");
        
        try {
            ValidationUtilDua.validation(animal);
            System.out.println("sukses");
        }catch (RuntimeException e){
            System.out.println("Tidak valid : " + e.getMessage());
        }
    }
}
