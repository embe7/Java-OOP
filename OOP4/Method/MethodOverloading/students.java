package OOP4.Method.MethodOverloading;

class students {
    String names;
    int NPM;
    String corse;

    students(String corse){
        this.corse = corse;
    }

    void sayData(){
        System.out.println("Hello " + this.names + " " + this.NPM);
        System.out.println("Corse " + this.corse);
    }

}
