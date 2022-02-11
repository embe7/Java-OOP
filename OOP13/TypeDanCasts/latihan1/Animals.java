package OOP13.TypeDanCasts.latihan1;

class Animals {
    String name;
    String habitat;

    Animals(String inputName,String inputHabitat){
        this.name = inputName;
        this.habitat = inputHabitat;
    }

    void sayAnimal(){
        System.out.println(this.name + " " + this.habitat);
    }
}
