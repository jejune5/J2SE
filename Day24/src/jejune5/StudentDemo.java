package jejune5;

/* ����3:��Ȼ���ݰ�ȫ�ˣ������أ�һ��һ��Ƭ���ÿ����Ҿ������ε�һ��һ�������
 * ���ʵ����?
 * 		ͨ��Java�ṩ�ĵȴ����ѻ��ƽ����
 * 
 * �ȴ����ѣ�
 * 		Object�����ṩ������������
 * 			wait():�ȴ�
 * 			notify():���ѵ����߳�
 * 			notifyAll():���������߳�
 * 		Ϊʲô��Щ������������Thread������?
 * 			��Щ�����ĵ��ñ���ͨ����������ã������Ǹղ�ʹ�õ�������������������
 * 			���ԣ���Щ�������붨����Object���С�
 */
public class StudentDemo {
	public static void main(String[] args) {

		// ������Դ
		Student s = new Student();

		// ���úͻ�ȡ����
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		// �߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// �����߳�
		t1.start();
		t2.start();
	}
}
