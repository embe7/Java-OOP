package OOP4.Method.MethodReturnValue;

class OperasiMatematika {
    int bilA;
    int bilB;
    String operator;

       public int operasi(int angka1, String OperatorOprasi , int angka2 ){

           this.bilA = angka1;
           this.operator = OperatorOprasi;
           this.bilB = angka2;

            int hasil = 0;
            switch (OperatorOprasi){
                case "+":
                    hasil = angka1 + angka2;
                    System.out.println("Hasil Penjumlahan = " + hasil);
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    System.out.println("Hasil Pengurangan = " + hasil);
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    System.out.println("Hasil Perkalian = " + hasil);
                    break;
                case "/":
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian = " + hasil);
                    break;
                default:
                    System.out.println("Operasi tidak ditemukan");
            }
            return hasil;
    }

}
