package threads;

public class DefaultThread {
	public static void main (String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		try {
		Thread.sleep(2000);
		System.out.println("sleep state--");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
