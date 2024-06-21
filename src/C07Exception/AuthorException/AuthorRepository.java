package C07Exception.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
    private List<Author> authorList;

    public AuthorRepository() {
        authorList = new ArrayList<>();
    }

    public void save(Author author) {
        this.authorList.add(author);
    }

    public Optional<Author> findByEmail(String email) {
       return authorList.stream().filter(author -> author.getEmail().equals(email)).findFirst();
    }

    public boolean findByEmail2(String email) {
        return authorList.stream().anyMatch(author -> author.getEmail().equals(email));
    }
    public boolean findByEmail3(String email) {
        for (Author author : authorList) {
            if (author.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }


    public List<Author> getAllAuthors() {
        return this.authorList;
    }
}
