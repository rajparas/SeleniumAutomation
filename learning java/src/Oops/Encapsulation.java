package Oops;

public class Encapsulation {

		private static int id;
		private static String name;
		
		public void setData(int id, String name)
		{
			this.id= id;
			this.name=name;
		}
		public static int getId()
		{
			return id;
		}
		public static String getname()
		{
			return name;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation enc = new Encapsulation();
		
		enc.setData(1,"Top");
		System.out.println(enc.getId()+" "+enc.getname());
		
		enc.setData(2,"Tech");
		System.out.println(enc.getId()+ " "+enc.getname());
	
	}

}
