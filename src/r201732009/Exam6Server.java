package r201732009;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam6Server {
	final static int PORT = 10016, BACKLOG = 200;
	static class SendStudentTask implements Runnable {
		Socket socket;

		public SendStudentTask(Socket socket){
			this.socket=socket;
		}
		@Override
		public void run() {
			try {
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				Student student = new Student("201732009","김윤서");
				out.writeObject(student);
				out.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(PORT, BACKLOG)) {
			while (true) {
				try (Socket socket = serverSocket.accept()) {
					new SendStudentTask(socket).run();

				} catch (Exception ex) {
				}
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}
