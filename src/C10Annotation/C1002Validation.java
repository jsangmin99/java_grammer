package C10Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class C1002Validation {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("hong", "");
        validate(user);

    }

    static void validate(Object object) throws IllegalAccessException {
        Class<?> myClass = object.getClass();
        Field[] fields = myClass.getDeclaredFields();

        for (Field f : fields) { // 모든 필드를 순회
            if(f.isAnnotationPresent(NotEmpty.class)){ // NotEmpty 어노테이션이 있는지 확인
                f.setAccessible(true); // private 필드 접근 허용
                String value = (String) f.get(object); // 필드 값 가져오기
                if(value == null || value.isEmpty()) {
                    NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(notEmpty.message());
                }

            }
        }

    }
}

class User {
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

// 특정 필드의 값이 비어있는지 아닌지 검사하는 어노테이션
//@Retention(RetentionPolicy.RUNTIME) : 런타임에 동작하도록 동작
@Retention(RetentionPolicy.RUNTIME)
//Field : 변수에 적용, METHOD : 메서드에 적용, TYPE : 클래스에 적용
@Target(ElementType.FIELD)
@interface NotEmpty {
    String message() default "This field cannot be empty";
}
