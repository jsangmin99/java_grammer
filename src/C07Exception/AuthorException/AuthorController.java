package C07Exception.AuthorException;

import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. 회원가입");
                System.out.println("2. 로그인");
                System.out.println("3. 회원목록 조회");
                System.out.println("0. 종료");

                try {
                    String input = sc.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("입력이 비어 있습니다. 유효한 메뉴 번호를 입력해주세요.");
                        continue;
                    }
                    int menu = Integer.parseInt(input);
                    switch (menu) {
                        case 1:
                            System.out.println("이름을 입력하세요:");
                            String name = sc.nextLine().trim();
                            if (name.isEmpty()) {
                                System.out.println("이름을 입력해주세요.");
                                continue;
                            }
                            System.out.println("이메일을 입력하세요:");
                            String email = sc.nextLine().trim();
                            if (email.isEmpty()) {
                                System.out.println("이메일을 입력해주세요.");
                                continue;
                            }
                            System.out.println("비밀번호를 입력하세요 (5자 이상):");
                            String password = sc.nextLine().trim();
                            if (password.isEmpty()) {
                                System.out.println("비밀번호를 입력해주세요.");
                                continue;
                            }

                            try {
                                authorService.registerAuthor(name, email, password);
                                System.out.println("회원가입이 완료되었습니다.");
                            } catch (IllegalArgumentException e) {
                                System.out.println("회원가입 실패: " + e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("이메일을 입력하세요:");
                            email = sc.nextLine().trim();
                            if (email.isEmpty()) {
                                System.out.println("이메일을 입력해주세요.");
                                continue;
                            }
                            System.out.println("비밀번호를 입력하세요:");
                            password = sc.nextLine().trim();
                            if (password.isEmpty()) {
                                System.out.println("비밀번호를 입력해주세요.");
                                continue;
                            }

                            try {
                                authorService.login(email, password);
                                System.out.println("로그인 성공!");
                            } catch (IllegalArgumentException e) {
                                System.out.println("로그인 실패: " + e.getMessage());
                            }
                            break;
                        case 3:
                            authorService.getAllAuthors();
                            break;
                        case 0:
                            System.out.println("프로그램을 종료합니다.");
                            return;
                        default:
                            System.out.println("유효한 메뉴 번호를 입력해주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력해주세요.");
                } catch (Exception e) {
                    System.out.println("예외가 발생했습니다: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
