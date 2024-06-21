package C09WebServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0903WebsServer3 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("8081 서비스 시작");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     OutputStream os = socket.getOutputStream()) {

                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null && !line.isEmpty()) {
                        sb.append(line).append("\n");
                    }
                    String requestString = sb.toString();
                    String firstLine = requestString.split("\n")[0];
                    System.out.println(firstLine);
                    String infos = firstLine.split(" ")[1];
                    System.out.println("인포스 : " + infos);
                    String inputId = "";
                    String inputName = "";
                    String inputEmail = "";
                    if (infos.contains("?")) {
                        String st1 = infos.split("\\?")[1];
                        String[] stArr = st1.split("&");
                        for (String s : stArr) {
                            String[] keyValue = s.split("=");
                            if (keyValue.length == 2) {
                                switch (keyValue[0]) {
                                    case "id":
                                        inputId = keyValue[1];
                                        break;
                                    case "name":
                                        inputName = keyValue[1];
                                        break;
                                    case "email":
                                        inputEmail = keyValue[1];
                                        break;
                                }
                            }
                        }
                    }

                    String url = "jdbc:mysql://localhost:3306/board1?useSSL=false&serverTimezone=UTC";
                    String userName = "root";
                    String password = "mariadb";

                    try (Connection con = DriverManager.getConnection(url, userName, password)) {
                        System.out.println("DB 연결 성공");

                        String myQuery = "SELECT * FROM Author";
                        boolean hasWhereClause = false;

                        if (!inputId.isEmpty()) {
                            myQuery += " WHERE id = ?";
                            hasWhereClause = true;
                        }
                        if (!inputName.isEmpty()) {
                            if (hasWhereClause) {
                                myQuery += " AND name = ?";
                            } else {
                                myQuery += " WHERE name = ?";
                                hasWhereClause = true;
                            }
                        }
                        if (!inputEmail.isEmpty()) {
                            if (hasWhereClause) {
                                myQuery += " AND email = ?";
                            } else {
                                myQuery += " WHERE email = ?";
                            }
                        }

                        try (PreparedStatement ps = con.prepareStatement(myQuery)) {
                            int paramIndex = 1;
                            if (!inputId.isEmpty()) {
                                ps.setInt(paramIndex++, Integer.parseInt(inputId));
                            }
                            if (!inputName.isEmpty()) {
                                ps.setString(paramIndex++, inputName);
                            }
                            if (!inputEmail.isEmpty()) {
                                ps.setString(paramIndex++, inputEmail);
                            }

                            try (ResultSet rs = ps.executeQuery()) {
                                StringBuilder responseContent = new StringBuilder();

                                while (rs.next()) {
                                    String dbName = rs.getString("name");
                                    String dbEmail = rs.getString("email");
                                    String dbPassword = rs.getString("password");

                                    System.out.println("name : " + dbName + ", email : " + dbEmail + ", password : " + dbPassword);
                                }

                                String httpResponse = "HTTP/1.1 200 OK\r\n" +
                                        "Content-Type: text/plain; charset=UTF-8\r\n" +
                                        "Content-Length: " + responseContent.length() + "\r\n" +
                                        "\r\n" +
                                        responseContent;

                                os.write(httpResponse.getBytes(StandardCharsets.UTF_8));
                                os.flush();
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                        String httpResponse = "HTTP/1.1 500 Internal Server Error\r\n" +
                                "Content-Type: text/plain; charset=UTF-8\r\n" +
                                "Content-Length: " + e.getMessage().length() + "\r\n" +
                                "\r\n" +
                                e.getMessage();
                        os.write(httpResponse.getBytes(StandardCharsets.UTF_8));
                        os.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
