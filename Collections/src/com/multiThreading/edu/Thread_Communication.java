package com.multiThreading.edu;



class Producer extends Thread
{
	StringBuffer sb;
	//boolean dataprodover=false;
	
	 Producer() {
		// TODO Auto-generated constructor stub
		 sb = new StringBuffer();
	
	}
	 public void run() {

		 synchronized (sb) {
			
		
		 for(int i =1;i<=10;i++)
		 {try{
			 sb.append(i +":");
			 Thread.sleep(100);
			 System.out.println("appending");
		 }catch (Exception e) {
			// TODO: handle exception
		}
		 
		 }
		 sb.notify();//dataprodover=true;
	}
}
}

class Consumer extends Thread
{
	Producer prod;
	public Consumer(Producer prod) {
		this.prod=prod;
	}
		public void run()
		{
			//synchronized (prod.sb) {
				
			
			try{
				prod.sb.wait();
//				while(!prod.dataprodover)
//					Thread.sleep(10);
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(prod.sb);
		}
	}
//}
public class Thread_Communication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Producer p=new Producer();
Consumer consumer = new Consumer(p);

Thread t1= new Thread(p);
Thread t2= new Thread(consumer);

t2.start();
t1.start();
	}

}
