package C05AnonymousLambda;


public class C0502AnonymousClass {
    public static void main(String[] args) {
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound3() {
                System.out.println("동물 소리를 냅니다.");
            }
        };
        Animal1 a2 = () -> System.out.println("동물 소리를 냅니다.");

        Animal2 a3 = (a,b,c) -> a+b+c;


    }
}

interface Animal2 {
    int makeSound(int a, int b, int c);
}

interface Animal1 {
    void makeSound();
}

abstract class AbstractAnimal {
    void makeSound2() {
        System.out.println("동물 소리를 냅니다.");
    }
    abstract void makeSound3();
}