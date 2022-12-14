package r201732009;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Exam4Server {
	public static void main(String[] args) {
        final int PORT = 10014;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    StringBuilder result = new StringBuilder();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                    while (true) {
                        String in = reader.readLine();
                        if (in == null) break;
                        result.append(in+"\n");
                    }
                    System.out.println(result.toString());
                } catch (IOException ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
