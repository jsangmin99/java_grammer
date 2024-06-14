package C02ClassBasic.Board;

import java.util.*;

public class Author{
    static Map<Long, Author> authorList = new TreeMap<>();
    static Long id =0L; //auto increment 어떻게?
    private Long index_id;
    private String name;
    private String email;
    private String password;
    private List<Post> posts = new ArrayList<>();

    public Author(String name, String email, String password){
        id += 1;
        this.index_id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static void printAuthorList() {
        System.out.println("회원전체목록을 조회합니다.");
        for (Author a : authorList.values()) {
            System.out.println("id : " + a.getId() + " | email : " + a.getEmail());
        }
    }

    public static void printAuthorDetailList() {
        System.out.println("회원 상세 조회합니다. id를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        Long inputId = Long.valueOf(sc.nextLine());
        for (Author a : authorList.values()) {
            if (a.getId().equals(inputId)) {
                System.out.println("id : " + a.getId() + " | name : " + a.getName()
                        + " | email : " + a.getEmail() + " | password : " + a.getPassword() + " | 작성글 수 : " + a.getPosts().size());
            }
        }
    }

    public Long getId() {
        return index_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    static void register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입을 진행합니다.");
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("이메일을 입력하세요.");
        String email = sc.nextLine();
        System.out.println("비밀번호를 입력하세요.");
        String password = sc.nextLine();
        Author author = new Author(name, email, password);
        authorList.put(author.getId(), author);
    }
    public List<Post> getPosts() {
        return posts;
    }

}
