package r201732009;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
public class Exam4Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
        final String HOST = "localhost";
        final int PORT = 10014;
        try (Socket socket = new Socket(HOST, PORT)) {
            Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
            out.write("201732009 김윤서");
            out.flush();
        }
    }
}
