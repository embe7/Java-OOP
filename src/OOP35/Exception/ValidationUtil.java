package OOP35.Exception;

public class ValidationUtil {

    public static void validation(LoginRequest loginRequest)throws ValidationException,NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidationException("username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginRequest.password().isBlank()){
            throw new ValidationException("password is blank");
        }
    }
}
