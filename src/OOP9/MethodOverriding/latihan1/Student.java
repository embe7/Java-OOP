package OOP9.MethodOverriding.latihan1;

class Student extends Corse{

    Student(String LevelJava, String LevelPHP,String LevelPython){
        super(LevelJava,LevelPHP,LevelPython);
    }

    void sayCorse(){
        System.out.println("Hello Student Your Level  : " + this.java);
        System.out.println("Hello Student Your Level  : " + this.PHP);
        System.out.println("Hello Student Your Level  : " + this.Python);
    }
}
