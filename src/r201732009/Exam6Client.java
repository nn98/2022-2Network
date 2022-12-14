package r201732009;
import java.io.ObjectInputStream;
import java.net.Socket;
public class Exam6Client {
    static final String HOST = "localhost";
    static final int PORT = 10016;
    static class GetStudentTask implements Runnable {
        @Override
        public void run() {
            try (Socket socket = new Socket(HOST, PORT)) {
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Student student = (Student) in.readObject();
                System.out.printf("%s %s\n", student.getStudentId(), student.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    	for(int i=0;i<10;i++)
            new Thread(new GetStudentTask()).start();
    }
}
