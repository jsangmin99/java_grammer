package C02ClassBasic;


public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));

//        회계 프로그램
//        A부서의 매출
//        20원 발생
        MyCalculator.sumAcc(20);
//        클래스 메서드 호출 방식 : 클래스명.메서드명();
        System.out.println(MyCalculator.total);
//        30원 발생
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
//        40원 발생
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);

//        B부서의 매출
//        10원 발생
        MyCalculator.total = 0;
        MyCalculator.sumAcc(10);
        MyCalculator.sumAcc(20);
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);


//        static 으로 인해 문제발생 각각 고유의 변수가 아니라 공용의 변수값이 되어버림

//        객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당
//        A 회사의 매출
        MyCalculatorInstance m1 = new MyCalculatorInstance();
//        개게 메서드 호출 방법 : 객체명.메서드명();
        m1.sumAcc(10);
        m1.sumAcc(20);
        m1.sumAcc(30);
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        m2.sumAcc(100);
        m2.sumAcc(200);
        m2.sumAcc(300);

        System.out.println(m1.total);
        System.out.println(m2.total);


        C0203Person person1 = new C0203Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
//        person1.name = "홍길동";
//        person1.email = "hongildong@gmail.com";
//        person1.age = 20;
//        person1.eating();
//
//        System.out.println("이름 : " + person1.name + "나이는 : " + person1.age);

//        일반적인 패턴은 변수값에 직접 접근하지 않는다.
//        의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴

        person1.setName("홍길동");
        person1.setEmail("hongildong@gmail.com");
        person1.setAge(20);
        person1.eating();
        System.out.println("이름 : " + person1.getName() + "나이는 : " + person1.getAge());

        Calendar cal1 = new Calendar();
        cal1.setDay("1");
        cal1.setMonth("1");
        cal1.setYear("2024");
        System.out.println(cal1.getYear() + "년 " + cal1.getMonth() + "월 " + cal1.getDay() + "일 입니다.");


    }
}
class Calendar{
    private String year;
    private String month;
    private String day;

//    생성자 : 클래스명과 동일, 초기화 하고 싶은 변수명 나열
//    별도의 생성자를 만들경우 초기 생성자를 따로 선언 필요
    Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    Calendar(){
    }

//    같은 클래스 내에서 생성자를 여러개 만들 수 있음 하지만 잘안씀 (생성자 오버로딩)
    Calendar(String year){
        this(year, null, null);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

class MyCalculator{
    static int total = 0;

    static int sum (int a, int b){
        return a + b;
    }

    static void sumAcc(int a) {
        total += a;
    }

}

class MyCalculatorInstance {
//    static이 없으면 객체변수, static이 있으면 클래스변수
    int total = 0;

    int sum(int a, int b) {
        return a + b;
    }

    void sumAcc(int a) {
        this.total += a;
    }

}