package OOP4.Method.MethodOverloading.latihan1;

class StudentSatu {
    String name;
    int npm;
    String kelas;
    String corse;

    StudentSatu(String corse){
        this.corse = corse;
    }
    void sayStudent(){
        System.out.println("Name  : " + this.name);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("Your corse : " + this.corse);
    }
}
