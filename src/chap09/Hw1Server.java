package chap09;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
public class Hw1Server {
    public static void main(String[] args) {
        final int PORT = 13;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                    out.write("학번: 201732009\n");
                    out.write("이름: 김윤서\n");
                    out.flush();
                } catch (IOException ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}