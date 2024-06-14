package C02ClassBasic.Board;

import javafx.geometry.Pos;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Post {
    static Map<Long, Post> postList = new TreeMap<>();
    static Long id = 0L;
    private Long index_id;
    private String title;
    private String content;
    private Author author;

    public Post( String title, String content, Author author){
        id += 1;
        this.index_id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        author.getPosts().add(this);
    }

    public static void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("게시글 작성을 진행합니다.");
        System.out.println("제목을 입력하세요.");
        String title = sc.nextLine();
        System.out.println("내용을 입력하세요.");
        String content = sc.nextLine();
        System.out.println("작성자의 id을 입력하세요.");
        String inputId = sc.nextLine();
        Author author = Author.authorList.get(Long.valueOf(inputId));
        if (author == null) {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        Post post = new Post(title, content, author);
        postList.put(post.getId(), post);
    }

    public static void printPostList() {
        System.out.println("게시글 전체목록을 조회합니다.");
        for (Post p : postList.values()) {
            System.out.println("id : " + p.getId() + " | title : " + p.getTitle() + " | 작성자 : " + p.getAuthor().getEmail());
        }
    }

    public static void printPostDetailList() {
        System.out.println("게시글 상세 조회합니다. id를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        Long inputId = Long.valueOf(sc.nextLine());
        for (Post p : postList.values()) {
            if (p.getId().equals(inputId)) {
                System.out.println("id : " + p.getId() + " | title : " + p.getTitle() + " | content : " + p.getContent()
                        + " | 작성자 : " + p.getAuthor().getEmail());
            }
        }
    }

    public Long getId() {
        return index_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }

}
