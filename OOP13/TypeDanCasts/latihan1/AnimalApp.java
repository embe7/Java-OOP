package OOP13.TypeDanCasts.latihan1;

public class AnimalApp {
    public static void main(String[] args) {

        AnimalsAbout animal1 = new AnimalsAbout("Kurakura","Danau");

        animal1.sayAnimal();

        Animals animal2 =new Animals("Anjing","hutan");

        animal2.sayAnimal();

        sayAnimals(new AnimalsAbout("Kucing","Rumah"));
        sayAnimals(new Animals("Buaya","Sungai"));
    }

    public static void sayAnimals(Animals animals){
        if (animals instanceof AnimalsAbout){
            System.out.println("From About");
        }else {
            System.out.println("Not From about");
        }
    }
}
