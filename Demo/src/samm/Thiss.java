package samm;

public class Thiss {
	
	String var;
	int b;
	Thiss(String var,int b)
	{
		this.var=var;
		this.b=b;
	}
	
	
	public void show()
	{
		System.out.println(var);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Thiss obj=new Thiss("appu",7);
	obj.show();
	
	
	
	
	}

}
