
public class RaceFreeTest {
	private String hat;
	public boolean tree;
	syncObject once; 
	public static void main(String[] args) throws InterruptedException{
		RaceFreeTest r = new RaceFreeTest();
		r.run();
	}

	public void run() throws InterruptedException{
		int numThreads = 4;
		Thread[] t = new Thread[numThreads];
		syncObject s = new syncObject(0);
		for (int i =0; i < numThreads; i++){
			Thread th = new Thread(new threadThing(i, s));
			t[i] = th;
		}
		for (Thread th : t)
			th.start();
		for(Thread th : t)
			th.join();
		


		System.out.println("Main thread closing. Result incoming: " + s.getValue());

	}
	syncObject twice; 

}

class threadThing implements Runnable{

	int tID;
	syncObject s;
	public threadThing(int threadNumber, syncObject s){
		tID = threadNumber;
		this.s = s;
	}

	@Override
	public void run(){
		int status; 
		synchronized (s){
			status = s.getValue();
		}
		while(status < 100){
			synchronized (s){
				// System.out.println("Thread " + tID + " now waiting to add");
				status = s.getValue();
				if (status < 100)
					s.add(tID);
			}
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){e.printStackTrace();}
		}
	}

}

class syncObject{
	int value;
	public syncObject(int v){
		value = v;
	}
	public void add(int threadNumber){
		System.out.println("Thread " + threadNumber + " is now adding to object.");
		value += 1;
		return;
	}
	public int getValue(){return value;}
}


