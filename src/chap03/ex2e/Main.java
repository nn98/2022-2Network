package chap03.ex2e;
public class Main {
	public static void main(String[] args) {
		int from = 1, to = 1000;
		OnSumFinishListener listener = new OnSumFinishListener() {
			@Override
			public void onSumFinish(SumTask task) {
				System.out.print(task.getFrom() + " ���� " + task.getTo() + " ���� �հ�� ");
				System.out.print(task.getResult());
			}
		};
		SumTask sumTask = new SumTask(from, to);
		sumTask.setOnSumFinishListener(listener);
		Thread thread = new Thread(sumTask);
		thread.start();
	}
}