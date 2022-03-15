package OOP39.TryWithResource.latihan1;

import java.io.BufferedReader;
import java.io.FileReader;

public class LatihanTryWithResourceApp {
    public static void main(String[] args) {
        try (BufferedReader BacaData = new BufferedReader(new FileReader("README.md"));){
            while (true){
                String line = BacaData.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("Error Membaca File " + throwable.getMessage());
        }
    }
}
