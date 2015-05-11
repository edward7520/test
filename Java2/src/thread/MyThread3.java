package thread;

public class MyThread3 extends Thread {

	public MyThread3(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
			if (i % 10 == 0) {
				yield(); // 暂停当前正在执行的线程对象，并执行其他线程
			}
		}
	}

}
