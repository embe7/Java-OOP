package OOP35.Exception.latihan2;

//util -> Kegunaan

public class ValidationUtilDua{

    public static void validation(DataRequest requestData) throws ValidationExceptionDua,NullPointerException{
        if (requestData.name() == null){
            throw new  NullPointerException("Nama Null");
        }else if (requestData.name().isBlank()){
            throw new ValidationExceptionDua("Nama blank");
        }else if (requestData.npm() == null ) {
            throw new NullPointerException("NPM null");
        }else if (requestData.npm().isBlank()){
            throw new ValidationExceptionDua("NPM blank");
        }else if (requestData.kelas() == null ) {
            throw new NullPointerException("Kelas null");
        }else if (requestData.kelas().isBlank()){
            throw new ValidationExceptionDua("Kelas blank");
        }
    }
}
