package Com.Assigment_9;

public class Constructor_Count {
	static int count=0;
Constructor_Count() {
	count++;
}
public static void main(String [] args) {
	Constructor_Count obj=new Constructor_Count();
	Constructor_Count obj1=new Constructor_Count();
	Constructor_Count obj2=new Constructor_Count();
	Constructor_Count obj3=new Constructor_Count();
	System.out.println("no of time you call this method =>"+count);
}
}
