package threads;

public class Demothreadclass extends Thread {
	
	public void task() {
	for(int i=1;i<10;i++) {
		try {
			Thread.sleep(2000);
			System.out.println("Thread extended class--");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	}
	public void run() {
		task();
	}

}
