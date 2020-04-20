package jejune5;

public class SellTicket extends Thread{

	public static int ticket = 100;
	
	@Override
	public void run() {
		while(true) {
			if(ticket > 0){
				System.out.println(getName()+"正在出售第"+(ticket--)+"票");
			}
		}
		
	}
}
