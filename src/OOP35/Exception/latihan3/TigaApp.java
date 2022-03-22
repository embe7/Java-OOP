package OOP35.Exception.latihan3;

public class TigaApp {
    public static void main(String[] args) {

        DataRequestAnimal dataAnimal = new DataRequestAnimal("kura-kura",null);

        try {
            ValidationUtilTiga.validation(dataAnimal);
            System.out.println("Data valid");
        }catch (ValidationExceptionTiga | NullPointerException e){
            System.out.println("Tidak valid : " + e.getMessage());
        }finally {
            System.out.println("selalu di eksekusi");
        }
    }
}
