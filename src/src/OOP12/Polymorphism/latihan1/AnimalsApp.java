package OOP12.Polymorphism.latihan1;

public class AnimalsApp {
    public static void main(String[] args) {

        sayDataAnimal(new Animal("Anjing","Hutan",4));
        sayDataAnimal(new Animal("Hiu","Laut",0));
        sayDataAnimal(new Animal("Kucing","Rumah",4));

    }
    static void sayDataAnimal(Animal DataAnimal){
        System.out.println("Nama : " + DataAnimal.names);
        System.out.println("Habitat : " + DataAnimal.habitat);
        System.out.println("Jumlah Kaki :  " + DataAnimal.valueLeg);
    }
}
