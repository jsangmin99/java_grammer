package C09WebServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class C0901WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null && !line.isEmpty()){
                    sb.append(line + "\n");
                }
                String requsesString = sb.toString();
                String firstLine = requsesString.split("\n")[0];
                String infos = firstLine.split(" ")[1];
                String id = "";
                if (infos.contains("?")){
                    String st1 = infos.split("\\?")[1];
                    String[] stArr = st1.split("&");
                    for (String s : stArr) {
                        String[] keyValue = s.split("=");
                        if (keyValue[0].equals("id")){
                            id = keyValue[1];
                        }
                    }
                }
                System.out.println("요청된 id : " + id);


                String httpResponse = "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/plain; charset=UTF-8\r\n" +
                        "Content-Length: 11\r\n" +
                        "\r\n" +
                        "Hello World";

                socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
                socket.getOutputStream().flush();

            }

    }
}
