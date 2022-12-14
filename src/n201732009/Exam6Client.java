package n201732009;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket; 
import java.util.Random;
public class Exam6Client {
	static Random random = new Random();
	static String[] a = { "one", "two", "three", "four", "five"};
	static class EchoTask implements Runnable {
		String s;
		EchoTask(String s){
			this.s=s;
		}
		@Override
		public void run() {
			final String HOST = "localhost";
			final int PORT = 8087;
			try (Socket socket = new Socket(HOST, PORT)) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
				writer.write(s);
				writer.write("\r\n");
				writer.flush();
				String s2 = reader.readLine();
				System.out.printf("%s\n", s2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++) {
			new Thread(new EchoTask(a[i])).start();
			Thread.sleep(60);
		}
	}
}
