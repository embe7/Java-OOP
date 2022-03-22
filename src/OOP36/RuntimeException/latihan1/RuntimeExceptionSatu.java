package OOP36.RuntimeException.latihan1;

public class RuntimeExceptionSatu {

    public static void validateRuntime(LoginRequestSatu loginRequest) throws RuntimeException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new BlankExceptionSatu("username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginRequest.password().isBlank()){
            throw new BlankExceptionSatu("password is blank");
        }
    }
}
