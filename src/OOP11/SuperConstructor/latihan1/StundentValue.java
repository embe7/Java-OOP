package OOP11.SuperConstructor.latihan1;

class StundentValue extends Value{

    StundentValue(String NameStudent,Integer ValueStudent){
        super(NameStudent,ValueStudent);
    }

    StundentValue(String NameStudent){
        super(NameStudent,null);
    }

    StundentValue(){
        super(null,null);
    }

    void sayFinalValue(){

        Integer ValueStudent;

        ValueStudent = this.valueJava;

        if (ValueStudent <= 50){
            System.out.println(this.name + " Level Basic");
        }else if (ValueStudent <= 80){
            System.out.println(this.name + " Level OOP");
        }else if (ValueStudent <= 100) {
            System.out.println(this.name + " Level Master");
        }else if (ValueStudent <= 0){
            System.out.println("Keep Learning up");
        }else {
            System.out.println("Not Fount");
        }
    }
}
