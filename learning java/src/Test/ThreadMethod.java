package Test;

class T implements Runnable
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
public class ThreadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		T t = new T();
		Thread th = new Thread(t);
		
		th.start();
		
	
		
	}

}
