package Com.Assigment_9;

public class Method_Count {
	static int total=0;
	static int count=0;
	public void mymethod() {
		count++;
		System.out.println("method count");
	}
	 public void sum() {
	 total++;
	}

	public static void main(String[] args) {
		Method_Count obj=new Method_Count();
		obj.mymethod();
		obj.mymethod();
		obj.mymethod();
		obj.sum();
		obj.sum();
		obj.sum();
		obj.sum();
		obj.sum();
		
	System.out.println("no of time you call mymethod   => "+count);	
	System.out.println("no of time you call sum method => "+total);
	}
			
		

	}


