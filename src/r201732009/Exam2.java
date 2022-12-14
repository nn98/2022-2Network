package r201732009;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam2 {

	static class PrintInfo implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("201732009 김윤서");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; ++i) {
			executor.submit(new PrintInfo());
		}
		executor.shutdown();
	}
}
