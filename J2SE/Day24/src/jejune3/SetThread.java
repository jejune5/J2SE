package jejune3;

public class SetThread implements Runnable {
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.name = "ëëë";
		s.age = 16;

	}

}
