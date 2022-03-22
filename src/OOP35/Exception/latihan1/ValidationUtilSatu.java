package OOP35.Exception.latihan1;

import OOP35.Exception.ValidationException;

public class ValidationUtilSatu {

    public static void validation(LoginRequestSatu loginRequest) throws ValidationExceptionSatu,NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidationExceptionSatu("username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginRequest.password().isBlank()){
            throw new ValidationExceptionSatu("password is blank");
        }
    }
}
