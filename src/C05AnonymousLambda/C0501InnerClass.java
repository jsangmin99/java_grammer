package C05AnonymousLambda;

public class C0501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass m1 = new MemberInnerClass.StaticInnerClass();
        m1.display();
    }
}

class MemberInnerClass {
    int a;

    void display(){
        System.out.println("a의 값은"+a);
    }

    static class StaticInnerClass{
        int b;
        void display(){
            System.out.println("b의값 "+b);
        }
    }
}