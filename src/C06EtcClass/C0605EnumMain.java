package C06EtcClass;

public class C0605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("홍길동");
        s1.setClassGrade(classGrade.c1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("김철수");
//        여전히 타입이 String타입이므로 임의 클래스변수 사용하지 않을수 있음.
        s2.setClassGrade("secondgrade");

//        roll의 경우 Enum설정시 위와 같은 실수를 방지할수있음
        EnumStudent s3 = new EnumStudent();
        s3.setName("이영희");
//        s3.setRoll("ADMIN_USER"); //타입 불일치
        s3.setRoll(Roll.ADMIN_USER);

        System.out.println(s3.getRoll());
        System.out.println(s3.getRoll().getClass());

//        enum값 내부에느 저장된 순서대로 index값이 내부적으로 할당
        System.out.println(Roll.ADMIN_USER.ordinal());


        System.out.println(s1);
    }

}


class classGrade{
    static final String c1 = "1학년";
    static final String c2 = "2학년";
    static final String c3 = "3학년";
}

enum Roll {
    //    static final이 생략이 되어있는 형식
    GENERAL_USER, ADMIN_USER, MANAGER_USER,
    ;
}

class EnumStudent{
    private String name;
    private String classGrade;
    private Roll roll;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }
}
