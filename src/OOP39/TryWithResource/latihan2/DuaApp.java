package OOP39.TryWithResource.latihan2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DuaApp {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }

    }
}
