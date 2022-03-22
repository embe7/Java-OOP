package OOP36.RuntimeException.latihan2;

public class ValidationUtilDua {
    public static void validation(AnimalRequestDua animalRequest){
        if (animalRequest.name() == null){
            throw new NullPointerException("name is null");
        }else if (animalRequest.name().isBlank()){
            throw new BlankExceptionDua("name is blank");
        }else if (animalRequest.habitat() == null){
            throw new NullPointerException("habitat is null");
        }else if (animalRequest.habitat().isBlank()){
            throw new BlankExceptionDua("habitat is blank");
        }
    }
}
