package OOP39.TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Try With Resource
 * - Di java 7, terdapat fitur baru bernama try with resource
 * - Try With Resource adalah sebuah mekanisme agar kita lebih mudah menggunkan resource (yang wajib di close)
 *   dalam blok try
 * - Jika kita ingin menggunakan fitur ini, kita wajib menggunkan interface AutoCloseable
 */

public class TryWithResourceApp {
    public static void main(String[] args) {
         try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
             while (true){
                 String line = reader.readLine();
                 if (line == null){
                     break;
                 }
                 System.out.println(line);
             }
         }catch (Throwable throwable){
             System.out.println("Error membaca file" + throwable.getMessage());
         }
    }
}
