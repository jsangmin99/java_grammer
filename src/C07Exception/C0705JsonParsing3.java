package C07Exception;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Spring dptjsms RestTemplate을 통해 HTTP요청하고
//        여기서는 java11에서 제공하는 HttpClient를 사용
//        Http클라인언트가 java에 내장
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts") )
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        String post = response.body();
//        System.out.println(responseBody);

        ObjectMapper jsonObject = new ObjectMapper();
        JsonNode jsonList = jsonObject.readTree(post);
        List<Post> postList = new ArrayList<>();

        for (JsonNode jsonNode : jsonList) {
            Post tempPost = jsonObject.readValue(jsonNode.toString(), Post.class);
            postList.add(tempPost);
        }
        System.out.println(postList);



//        List<Post> 객체를 json으로 직렬화
        String jsonPostList = jsonObject.writeValueAsString(postList);
        System.out.println(jsonPostList);


    }
}
class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "유저 아이디 =" + userId +
                ", 아이디 =" + id +
                ", 제목 ='" + title + '\'' +
                '}';
    }
}
