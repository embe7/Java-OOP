package OOP6.ConstructorOverloading.latihan1;

class Corse {

    String java;
    String PHP;
    String Python;

    Corse(String LearningJava, String LearningPHP, String LearningPython){
        this.java = LearningJava;
        this.PHP = LearningPHP;
        this.Python = LearningPython;
    }

    Corse(String LearningJava, String LearningPHP){
        this(LearningJava,LearningPHP,null);
    }

    Corse(String LearningJava){
        this(LearningJava,null,null);
    }

    Corse(){
        this(null,null,null);
    }

    void SayLevel(){
        System.out.println("Your Java Level : " + this.java);
        System.out.println("Your PHP Level : " + this.PHP);
        System.out.println("Your Python Level : " + this.Python);
    }
}
