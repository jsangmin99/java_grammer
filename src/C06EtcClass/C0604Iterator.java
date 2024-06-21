package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

//        enhanced for loop : 원본변경 불가
        System.out.println("============Enhanced for loop============");
        for (String s : myList) {
            System.out.println(s);
        }

//        Iterator : 원본변경 가능 -> remove() 메서드로 삭제 가능
        System.out.println("============Iterator============");
        Iterator<String> iters = myList.iterator();
        while (iters.hasNext()) {
            System.out.println(iters.next());
        }

        System.out.println("============Iterator remove============");
        Iterator<String> iters2 = myList.iterator();
        while (iters2.hasNext()) {
            String s = iters2.next();
            if (s.equals("banana")) {
                iters2.remove();
            }
        }
        System.out.println(myList);



    }
}
