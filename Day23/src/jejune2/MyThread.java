package jejune2;

public class MyThread extends Thread {
	@Override
	public void run() {
		// �Լ�д����
		// һ����˵�����߳�ִ�еĴ���϶��ǱȽϺ�ʱ�ġ�����������ѭ���Ľ�
		for (int x = 0; x < 200; x++) {
			System.out.println(x);
		}
	}
}
