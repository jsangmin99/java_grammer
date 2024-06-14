package C02ClassBasic.Board;

import java.util.Scanner;


public class boardService {
    public static void main(String[] args) {
//        List<Author> authorList = new ArrayList<>();
//        List<Post> postList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("원하시는 서비스를 입력하세요 : 1. 회원가입, 2. 회원목록 조회, 3. 회원상세 조회, " +
                    "4. 게시글 작성, 5. 게시글 목록 조회, 6. 게시글 상세 조회, 0. 종료");
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (input.equals("1")) {
                Author.register();
            }
            if (input.equals("2")) {
                Author.printAuthorList();
            }
            if (input.equals("3")) {
                Author.printAuthorDetailList();

            }
            if (input.equals("4")) {
                Post.write();

            }
            if (input.equals("5")) {
                Post.printPostList();


            }
            if (input.equals("6")) {
                Post.printPostDetailList();

            }

        }



    }

}
