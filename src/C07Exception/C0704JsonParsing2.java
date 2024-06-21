package C07Exception;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C0704JsonParsing2 {
    public static void main(String[] args) throws IOException {
//        test data2의 데이터를 student형태롤 풀력
        Path filePath = Paths.get("src/C07Exception/resources/test_data2.json");
        ObjectMapper jsonObject = new ObjectMapper();

        String jsonString = Files.readString(filePath);

        JsonNode jsonList = jsonObject.readTree(jsonString);

        List<Student> studentList = new ArrayList<>();
        for (JsonNode jsonNode : jsonList) {
            Student tempStudent = jsonObject.readValue(jsonNode.toString(), Student.class);
        }

        System.out.println(studentList);





    }
}
