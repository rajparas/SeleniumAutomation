package Thread;

class Th2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Th2 :"+i);
		}
	}
}

public class ThreadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Th2 t = new Th2();
		Thread th = new Thread(t);
		th.start();
		
	}

}
