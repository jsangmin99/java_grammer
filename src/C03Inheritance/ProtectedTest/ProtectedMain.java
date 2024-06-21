package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;
// *을 통해 모든 클래스를 import할 수 있지만, 권장하지 않음
// *을 통해 패키지 내에 패키지까지 포함해서 모든 클래스를 import는 불가능
// ec) import java.* 불가
//import C03Inheritance.*;


public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        public 변수는 어디서든 접근 가능
        System.out.println(c1.st4);
////        protected 접근 불가
//        System.out.println(c1.st3);
        ProtectedMain p1 = new ProtectedMain();
////        default 변수는 같은 패키지 내에서 접근 가능
//        System.out.println(p1.st2);
//        상속한 객체에서 protected 접근 가능
        System.out.println(p1.st3);
    }
}
