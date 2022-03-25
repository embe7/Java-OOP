package OOP4.Method.MethodReturnValue.latihan1;

class OperasiSatu {
    int bilA;
    int bilB;
    String operator;

    public int operasi(int angka1, String operator, int angka2){
        this.bilA = angka1;
        this.bilB = angka2;
        this.operator = operator;

        int hasil = 0;

        switch (operator){
            case "+" :
                hasil = bilA + bilB;
                System.out.println(hasil);
                break;
            case "-" :
                hasil = bilA - bilB;
                System.out.println(hasil);
                break;
            case "*" :
                hasil = bilA * bilB;
                System.out.println(hasil);
                break;
            case "/" :
                hasil = bilA / bilB;
                System.out.println(hasil);
                break;
            default:
        }
        return hasil;
    }
}
