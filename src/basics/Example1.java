package basics;

public class Example1 
{
	
	public void add()
	{
		int a=10,b=20,c;
		
		c=a+b;
		
		System.out.println("Add result = "+  c);
	}

	public static void main(String[] args) 
	{
		Example1 e1=new Example1();
		
		e1.add();

	}

}
