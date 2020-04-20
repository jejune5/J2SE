package jejune4;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "é����";
					s.age = 16;
				}else {
					s.name = "����";
					s.age = 25;
				}
			}
		}
	}
}
