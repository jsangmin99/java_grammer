package C07Exception;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MyCatchException {
    public static void main(String[] args) {
        System.out.println("try-catch-finally 구문을 사용한 파일 수신 예제");
        receiveFileTCF("", 1234, "C:/Temp/MyFile.txt");

        System.out.println("try-with-C07Exception.resources 구문을 사용한 파일 수신 예제");
        receiveFileTWR("localhost", 1234, "C:/Temp/MyFile.txt");

    }

    private static void receiveFileTCF(String serverAddres, int port, String outputFile) {
        Socket socket = null;
        InputStream in = null;
        FileOutputStream fileOut = null;

        try {
            socket = new Socket(serverAddres, port);
            in = new BufferedInputStream(socket.getInputStream());
            fileOut = new FileOutputStream(outputFile);

            System.out.println("서버에 연결됨: " + serverAddres + ":" + port);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("파일 수신 완료: " + outputFile);

        } catch (SocketException e) {
            System.out.println("알 수 없는 호스트: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O 예외 발생: " + e.getMessage());
        } finally {
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
                if (in != null) {
                    in.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                System.out.println("I/O 예외 발생: " + e.getMessage());
            }
        }
    }

    public static void receiveFileTWR(String serverAddress, int port, String outputFile) {
        try (
                Socket socket = new Socket(serverAddress, port);
                InputStream in = new BufferedInputStream(socket.getInputStream());
                FileOutputStream fileOut = new FileOutputStream(outputFile)
        ) {
            System.out.println("서버에 연결됨: " + serverAddress + ":" + port);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("파일 수신 완료: " + outputFile);

        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O 예외 발생: " + e.getMessage());
        }
    }

}
