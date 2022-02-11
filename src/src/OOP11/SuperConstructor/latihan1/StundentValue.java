package OOP11.SuperConstructor.latihan1;

class StundentValue extends Value{

    StundentValue(String NameStudent,Integer ValueStudent){
        super(NameStudent,ValueStudent);
    }

    StundentValue(String NameStudent){
        super(NameStudent);
    }

    StundentValue(){
        super();
    }
}
