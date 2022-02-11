package OOP13.TypeDanCasts.latihan1;

class AnimalsAbout extends Animals{

    AnimalsAbout(String name,String habitat){
        super(name,habitat);
    }

    void sayAnimal(){
        System.out.println(this.name + " " + this.habitat);
    }
}
