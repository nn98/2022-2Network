package r201732009;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class Exam5Server {
    public static void main(String[] args) {
        final int PORT = 10015, BACKLOG = 200;
        try (ServerSocket serverSocket = new ServerSocket(PORT, BACKLOG)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    Student student = new Student("201732009","김윤서");
                    out.writeObject(student);
                    out.flush();
                } catch (Exception ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
