package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass pc= new C0304ProtectedClass();
////        public 변수는 어디서든 접근 가능
//        System.out.println(pc.st4);
////        private 변수는 같은 클래스 내에서만 접근 가능
//        System.out.println(pc.st1);

//        protected 변수는 같은 패키지 내에서 접근 가능
//        default클래스여고 ㅈ접근가능
        System.out.println(pc.st3);
//        default 변수는 같은 패키지 내에서 접근 가능
        System.out.println(pc.st2);


    }
}
