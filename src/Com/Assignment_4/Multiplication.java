package Com.Assignment_4;

public class Multiplication {
public double multi(double number,double number1) {
	double result =number *number1;
	return result;
}
	public static void main(String[] args) {
		double num1=24.25;
		double num2=42.36;
		Multiplication obj=new Multiplication();
		double result=obj.multi(num1, num2);
System.out.println("multiplcation of two number="+result);
	}

}
