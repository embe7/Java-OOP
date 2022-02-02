package OOP8.Inheritance.latihan1;

class Corse {
    String Java;
    String PHP;
    String Python;

    Corse(String LearningJava, String LearningPHP, String LearningPython){
        this.Java = LearningJava;
        this.PHP = LearningPHP;
        this.Python = LearningPython;
    }

    void sayLevelCorse(){
        System.out.println("Your Level Java   : " + this.Java);
        System.out.println("Your Level PHP    : " + this.PHP);
        System.out.println("Your Level Python : " + this.Python);
    }
}
