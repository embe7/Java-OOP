package OOP21.RecursiveMethod;

/**
 *==== Recursive Method ====
 * - adalah kemampuan method memanggil method dirinya sendiri
 * - kadang memang ada banyak problem, yang lebih mudahh diselesaikan menggunakan recursive method,
 *   seperti contoh kasus factorial
 *
 *==== Problem Dengan Recursive ====
 * - walaupun recursive method itu sangat menarik, namun kita perlu berhati hati
 * - jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error stackOverflow, yaitu error
 *   dimana stack method terlalu banyak di java
 * - kenapa problem ini bisa terjadi? karena ketika kita memanggil method lain, maka stack akan
 *   menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error
 *   stackOverflow
 */

public class RecursiveMethodApp {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        System.out.println(recursiveFactorial(5));

    }
    //faktorial dengan perulangan biasa
    static int factorial(int value){
        var result = 1;
        for (var i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }

    //recursive mehod
    static int recursiveFactorial(int value){
        if (value == 1){
            return 1;
        }else {
            return value * recursiveFactorial(value - 1);
        }
    }
}
