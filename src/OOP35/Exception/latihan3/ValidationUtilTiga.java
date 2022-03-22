package OOP35.Exception.latihan3;

public class ValidationUtilTiga {

    public static void validation(DataRequestAnimal animalRequest) throws ValidationExceptionTiga,NullPointerException{
        if (animalRequest.name() == null){
            throw new NullPointerException("name is null");
        }else if (animalRequest.name().isBlank()){
            throw new ValidationExceptionTiga("name is blank");
        }else if (animalRequest.habitat() == null){
            throw new NullPointerException("habitat is null");
        }else if (animalRequest.habitat().isBlank()){
            throw new ValidationExceptionTiga("habitat is blank");
        }
    }
}
