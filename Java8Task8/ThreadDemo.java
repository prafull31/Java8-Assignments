package Java8Task8;

public class ThreadDemo {
	public static void main(String[] args) {

		

		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value Of I Is " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.setName("Prafull");
		t.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread(thread2);
		t2.setName("TableThread");
		t2.start();
	}
}
