package jejune5;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (!s.flag) {
					try {
						s.wait();// t2�͵ȴ��ˡ������ͷ����������ѹ�����ʱ���Ǵ������ѹ�����ʱ��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(s.name + "---" + s.age);
				// é����---16
				// ����---25

				// �޸ı��
				s.flag = false;
				// �����߳�
				s.notify();// ����t1
			}
		}
	}
}