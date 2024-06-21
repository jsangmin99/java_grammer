package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();

        AnimalInterface1 cat2 = new CatImplements();
        cat2.makeSound();
        AnimalInterface1 dog2 = new DogImplements();
        dog2.makeSound();

//        멀티
        System.out.println("멀티");
        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("러시안 블루", "똥고양이"));
        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("진돗개", "발발이"));

////        주의 사항
//        AnimalInterface1 cat4 = new CatMultiImplements();
//        cat4.makeSound();
//        System.out.println(cat4.play("러시안 블루", "똥고양이"));
//        AnimalInterface2 dog4 = new DogMultiImplements();
//        dog4.makeSound();
//        System.out.println(dog4.play("진돗개", "발발이"));


//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
//        익명 내부 클래스 방식으로 생성 가능

        AnimalInterface1 animal1 = new AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("익명 내부 클래스로 생성한 객체");
            }
        };
        animal1.makeSound();

    }
}
