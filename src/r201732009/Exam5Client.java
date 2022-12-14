package r201732009;
import java.io.ObjectInputStream;
import java.net.Socket;
public class Exam5Client {
    public static void main(String[] args) throws Exception {
        final int PORT = 10015;
        final String HOST = "localhost";
        try (Socket socket = new Socket(HOST, PORT)) {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Student student = (Student)in.readObject();
            System.out.printf("%s %s\n", student.getStudentId(), student.getName());
        }
    }
}
