package multiThreading;

class Chef implements Runnable {
	private Object lock;

	Chef(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			try {
				System.out.println("Chef preparing the food for 10 seconds\n");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Waiter implements Runnable {
	private Object lock;

	Waiter(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			try {
				System.out.println("Waiter delivers the order in 5 seconds\n");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Restaurant {
	public static void main(String[] args) {
		System.out.println("JAVA MULTITHREADING IMPLEMENTATION\n");
		Object obj = new Object();
		Thread chef = new Thread(new Chef(obj));
		Thread waiter = new Thread(new Waiter(obj));
		chef.start();
		waiter.start();
	}
}