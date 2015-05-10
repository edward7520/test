package thread;

public class TestYield {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3("t1");
		MyThread3 t2 = new MyThread3("t2");
		t1.start();
//		t1.setDaemon(true);	//将该线程设置为守护线程
		t2.start();
	}
}
