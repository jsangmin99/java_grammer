package C07Exception.AuthorException;

public class Author {
    static Long indexId = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        this.id = ++indexId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
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
}
