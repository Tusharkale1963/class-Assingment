package Com.armstrong_number;

public class Swapping {
 void Swap() {
	 int a=10;
	 int b=20;
	 int c=30;
	int temp;
	System.out.println(a+" "+ b+" "+c);
	temp=a;
	a=b;
	b=c;
	c=temp;
	System.out.println(a+" "+ b+" "+c);
 }
	public static void main(String[] args) {
		Swapping obj=new Swapping();
		obj.Swap();

	}

}
