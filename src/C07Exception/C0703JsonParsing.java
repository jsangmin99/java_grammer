package C07Exception;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsing {
    public static void main(String[] args) throws IOException {
        ObjectMapper jsonObject = new ObjectMapper();
        Path filePath = Paths.get("src/C07Exception/resources/test_data1.json");
        String jsonString = Files.readString(filePath);
        System.out.println(jsonString);

        JsonNode data1 = jsonObject.readTree(jsonString);
        System.out.println(data1);

        Map<String, Object> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asInt());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());

        System.out.println(studentMap);

//        readValue() 메소드를 사용하여 JSON 문자열을 Java 객체로 변환
        System.out.println("readValue() 메소드를 사용하여 JSON 문자열을 Java 객체로 변환");
        Map<String ,String> studentMap2 = jsonObject.readValue(jsonString, Map.class);
        System.out.println(studentMap2);

//        student객체 생성 및 toString 오버라이딩
        System.out.println("student객체 생성 및 toString 오버라이딩");
        Student student3 = jsonObject.readValue(jsonString, Student.class);
        System.out.println(student3);


    }
}
// objectMapper는 getter 또는 setter를 통해 값을 반환한다.
// ㄱㄷ림ㅊ샤ㅐㅜ

class Student{
    private Long id;
    private String name;
    private String classNumber;
    private String city;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id ='" + id + '\'' +
                ", 이름은 ='" + name + '\'' +
                ", classNumber = '" + classNumber + '\'' +
                ", city = '" + city + '\'' +
                '}';
    }
}
