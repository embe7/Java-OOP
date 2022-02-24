package OOP33.StaticKeyword.StaticMethod;

public class StaticMethod {
    public static int sum(int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        return total;
    }
}
