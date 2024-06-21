package C09WebServer;


import java.sql.*;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException {
//        mysql 드라이버가 필요
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false&serverTimezone=UTC";

        String userName = "root";
        String password = "mariadb";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

//        statement 객체를 통해 쿼리를 실행
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM post";
        ResultSet rs = st.executeQuery(myQuery);

        int id = 0;
        String title = "";
        while (rs.next()){
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("id는 " + id + " title은 " + title);
        }





    }
}
