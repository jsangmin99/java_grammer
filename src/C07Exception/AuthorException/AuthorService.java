package C07Exception.AuthorException;

import java.util.List;
import java.util.Objects;

public class AuthorService {
    //    throw new 로 에러발생시키고 Controller로 위동
    private AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }

    public void registerAuthor(String name, String email, String password) throws IllegalArgumentException{
//        동일한 email이있는 경우 비밀번호가 5자리 이하인 경우 예외처리
        if (authorRepository.findByEmail(email).isPresent())
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");

        if (password.length() < 5)
            throw new IllegalArgumentException("비밀번호는 5자 이상이어야 합니다.");

        Author author = new Author(name, email, password);
        authorRepository.save(author);

    }

    public void login (String email, String password) throws IllegalArgumentException{
//        해당 이메일 유저가 있는지 없으면 예외처리 , 비밀번호 일치하지 않으면 예외 처리
        Author author = checkEmail(email);
        // 비밀번호 일치하지 않는지
        if(!author.getPassword().equals(password))
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        else
            System.out.println("로그인 성공");
    }

    public void login2(String email, String password) throws IllegalArgumentException{
        List<Author> authorList = authorRepository.getAllAuthors();
        boolean emailNotFound = false;
        boolean passwordNotMatch = false;

        for (Author author : authorList) {
            if (author.getEmail().equals(email)) {
                emailNotFound = true;
                if (author.getPassword().equals(password)) {
                    passwordNotMatch = true;
                }
            }
        }
        if (!emailNotFound) {
            throw new IllegalArgumentException("존재하지 않는 이메일입니다.");
        }
        if (!passwordNotMatch) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
    }

    public Author checkEmail(String email) {
        return authorRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 이메일입니다."));
    }

    public void getAllAuthors() {
        authorRepository.getAllAuthors();
    }
}

