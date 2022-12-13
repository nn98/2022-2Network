package chap03.ex3a;
public class Main {
	public static void main(String[] args) {
		OnSumFinishListener listener = new OnSumFinishListener() {
			@Override
			public void onSumFinish(SumTask task) {
				System.out.printf("%d ���� %d ���� �հ�� %d\n",
						task.getFrom(), task.getTo(), task.getResult());
			}
		};
		int from = 1;
		for (int to = 10; to <= 1000000; to += 10) {
			SumTask sumTask = new SumTask(from, to);
			sumTask.setOnSumFinishListener(listener);
			Thread thread = new Thread(sumTask);
			thread.start();
		}
	}
}
