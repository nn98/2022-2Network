package r201732009;

public class Exam1 {

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
        for (int i = 0; i < 10; ++i)
            new Thread(new PrintInfo()).start();
    }
}
