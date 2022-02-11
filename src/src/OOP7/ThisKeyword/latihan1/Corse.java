package OOP7.ThisKeyword.latihan1;

class Corse {
    String java;
    String PHP;
    String Python;

    Corse(String LearningJava, String LearningPHP,String LearningPython){
        this.java = LearningJava;
        this.PHP = LearningPHP;
        this.Python = LearningPython;
    }

    void sayCorse(){
        System.out.println("Corse : " + this.java + " " + this.PHP + " " + this.Python);
    }
}
