package Thread;

class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{	
			if(i==5)
			{
	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			System.out.println("Th1 :"+i);
		}
	}
}

class Th3 extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("Th3 :"+i);
		}
	}
}



public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Th1 t1 = new Th1();
		Th3 t3 = new Th3();
		
		/* t1.run();
		 t3.run(); */
		
		t1.start();
		
		t3.start();
		
		
		
	}

}
