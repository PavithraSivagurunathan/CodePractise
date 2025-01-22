package threads;

public class UserDefinedThread {
	
	public static void main (String[] args) {
		Demothreadclass dm = new Demothreadclass();
		dm.start();
		for (int i =0;i<4;i++) {
			try {
				System.out.println(Thread.currentThread().getPriority());
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName());
			}catch(Exception e) {
				
			}
			
		}
		
	}

}
