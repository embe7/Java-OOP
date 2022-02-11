package OOP4.Method;

class Student {
    //field
    final String MenuNilai = "Menu Nilai";

    //Method dengan Parameter
    void sayHello(String name){
        System.out.println("Hello " + name + " Selamat Datang di " + MenuNilai);
    }

    //Method dengan variabel Argumen

    void sayNilai(int... values){
        int total = 0;
        for (int value : values){
            total += value;
        }
        int NilaiAkhir = total / values.length;
        if (NilaiAkhir >= 65){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda Tidak Lulus");
        }
    }
}
