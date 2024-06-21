package C05AnonymousLambda;


public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    //                방법1. Student객체에서 Comparable을 구현 => compareTo 메서드를 오버라이딩

        public int compareTo(Student s) {
            return this.age - s.getAge();
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
//        @Override
//        public int compareTo(Student s) {
//            return this.name.compareTo(s.getName());
//        }


}
