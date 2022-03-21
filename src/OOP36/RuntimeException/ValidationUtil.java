package OOP36.RuntimeException;

import OOP35.Exception.LoginRequest;

public class ValidationUtil {

    public static void validation(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new BlankException("username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginRequest.password().isBlank()){
            throw new BlankException("password is blank");
        }
    }


}
