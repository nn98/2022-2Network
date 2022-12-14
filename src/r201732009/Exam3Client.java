package r201732009;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
public class Exam3Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
        final String HOST = "localhost";
        final int PORT = 10013;
        try (Socket socket = new Socket(HOST, PORT)) {
            StringBuilder result = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            while (true) {
                String in = reader.readLine();
                if (in == null) break;
                result.append(in+"\n");
            }
            System.out.println(result.toString());
        }
    }
}
