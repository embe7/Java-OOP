package OOP9.MethodOverriding.latihan1;

class Corse {

    String name;

    String java;
    String PHP;
    String Python;

    Corse(String LearningJava, String LearningPHP, String LearningPython){
        this.java = LearningJava;
        this.PHP = LearningPHP;
        this.Python = LearningPython;
    }

    void SayCorse(){
        System.out.println("Hello Your corse : " + this.java );
        System.out.println("Hello Your corse : " + this.PHP );
        System.out.println("Hello Your corse : " + this.Python );
    }
}
