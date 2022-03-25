package OOP4.Method.Parameter.latihan1;

class StudentSatu {
    String name;
    int npm;

    StudentSatu(String name, int npm){
        this.name = name;
        this.npm = npm;
    }
    void sayStudent(String hoby){
        System.out.println("Name : " + this.name);
        System.out.println("NPM : " + this.npm);
        System.out.println("Hoby : " + hoby);
    }
}
