package Array;

public class Array_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {10,20,30,40,50,60,70};
		int b[] = new int[10];
		
		System.arraycopy(a, 1, b, 0, 3);
		for (int i=0; i<b.length;i++)
		{
		System.out.println(b[i]);
		}
	}

}
