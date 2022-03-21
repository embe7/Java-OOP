package OOP41.Reflection;

import OOP36.RuntimeException.BlankException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validationReflectin(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + "is blank");
                    }

                }catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}

