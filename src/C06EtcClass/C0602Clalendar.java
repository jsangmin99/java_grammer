package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Clalendar {
    public static void main(String[] args) {
//        java.util 패키지의 Calendar 클래스
        Calendar cal1 = Calendar.getInstance();
        System.out.println(cal1.getTime());

        System.out.println(cal1.get(Calendar.YEAR));
        System.out.println(cal1.get(Calendar.MONTH) + 1); //0~11
        System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal1.get(Calendar.DAY_OF_WEEK)); //1~7
        System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal1.get(Calendar.MINUTE));
        System.out.println(cal1.get(Calendar.SECOND));


//        java.time 패키지 : Local~ 로 시작하는 클래스들이 추가됨
//        날짜(LocalDate) - date타입, 시간(LocalTime) - time타입, 날짜와 시간(LocalDateTime) - datetime타입
        LocalDate presetDate = LocalDate.now();
        System.out.println(presetDate);
        System.out.println(presetDate.getYear());
        System.out.println(presetDate.getMonth());
        System.out.println(presetDate.getDayOfMonth());
        System.out.println(presetDate.getDayOfWeek());




//        임의로 특정 시간을 만들어
        LocalDate birthday = LocalDate.of(1999, 11, 1);
        System.out.println(birthday.getYear());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getDayOfMonth());

        LocalTime birthdayTime = LocalTime.of(12, 30, 30);
        System.out.println(birthdayTime.getHour());
        System.out.println(birthdayTime.getMinute());
        System.out.println(birthdayTime.getSecond());

        LocalDateTime birthdayDateTime = LocalDateTime.of(1999, 11, 1, 12, 30);

//        매개변수로 크로노필드 enum타입을 사용하여 프로그램의 유연성을 향상
        System.out.println(birthdayDateTime.get(ChronoField.YEAR));
        System.out.println(birthdayDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthdayDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthdayDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(birthdayDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(birthdayDateTime.get(ChronoField.SECOND_OF_MINUTE));

//        0: 오전, 1: 오후
        System.out.println(birthdayDateTime.get(ChronoField.AMPM_OF_DAY));
        myWatch(LocalDateTime.now(), ChronoField.HOUR_OF_DAY);
        myWatch(LocalDateTime.now(), ChronoField.AMPM_OF_DAY);
    }

//    크로노 필드를 쓰는 이유
//    1. 코드의 가독성을 높임
//    2. 코드의 유연성을 높임
//    매번 쓸때마다 쓰는 양식을 일일히 작성하지 않아도
    static void myWatch(LocalDateTime localDateTime, ChronoField c) {
        if (c == ChronoField.HOUR_OF_DAY) {
            System.out.println("연도는 " + localDateTime.get(ChronoField.YEAR) + "년 입니다.");
        } else if (c == ChronoField.MONTH_OF_YEAR) {
            System.out.println("월은 " + localDateTime.get(ChronoField.MONTH_OF_YEAR) + "월 입니다.");
        }else if(c == ChronoField.DAY_OF_MONTH) {
            System.out.println("일은 " + localDateTime.get(ChronoField.DAY_OF_MONTH) + "일 입니다.");
        } else if (c == ChronoField.AMPM_OF_DAY) {
            if (localDateTime.get(ChronoField.AMPM_OF_DAY) == 0) {
                System.out.println("오전 입니다.");
            } else {
                System.out.println("오후 입니다.");
            }
        }
    }


}
