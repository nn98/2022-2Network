package r201732009;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
public class Exam3Server {
	public static void main(String[] args) {
        final int PORT = 10013;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                    out.write("201732009 김윤서");
                    out.flush();
                } catch (IOException ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
