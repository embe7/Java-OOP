package OOP35.Exception.latihan1;

public class ValidationExceptionSatu extends Throwable {
    private String massage;

    //contruction
    public ValidationExceptionSatu(String message){
        super(message);
    }
}
