package n201732009;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket; 
import java.util.Random;
public class Exam5Client {
	static Random random = new Random();
	static String[] a = { "one", "two", "three", "four", "하나", "둘", "셋" };
	static class EchoTask implements Runnable {
		@Override
		public void run() {
			final String HOST = "localhost";
			final int PORT = 8086;
			try (Socket socket = new Socket(HOST, PORT)) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
				String s1 = "안녕하세요";
				writer.write(s1);
				writer.write("\r\n");
				writer.flush();
				String s2 = reader.readLine();
				System.out.printf("%s", s2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Thread(new EchoTask()).start();
	}
}
