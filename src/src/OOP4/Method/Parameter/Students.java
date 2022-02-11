package OOP4.Method.Parameter;

class Students {
    //field
    String names;
    int npm;
    String Kelas;
    final String country = "Indonesia";

    //constructor
    Students(String name, int npm, String kelas){
        this.names = name;
        this.npm = npm;
        this.Kelas = kelas;
    }

    void sayHoby(String hoby){
        System.out.println("Name : " + names);
        System.out.println("NPM : " + npm );
        System.out.println("Kelas : " + Kelas);
        System.out.println("Country : " + country);
        System.out.println("Hoby : " + hoby);
    }
}
