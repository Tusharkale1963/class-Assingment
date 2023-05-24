package Com.Assignment_4;

import java.util.Scanner;

public class Average {
 public void Averagenum() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Hindi sub no.= ");
	 int num1=sc.nextInt();
	 System.out.println("Enter Geo sub  no.= ");
	 int num2=sc.nextInt();
	 System.out.println("Enter History sub no.= ");
	 int num3=sc.nextInt();
	 System.out.println("Enter English sub no.= ");
	 int num4=sc.nextInt();
	 System.out.println("Enter Marathi sub no.= ");
	 int num5=sc.nextInt();
	 int Total_Mark= num1+num2+num3+num4+num5;
	 System.out.println(" Total Mark is "+ Total_Mark+"/500");
	  double  Avarage= Total_Mark/5;
	  System.out.println("the Avarage of all number= "+Avarage+" %");
 }
	public static void main(String[] args) {
		Average obj=new Average();
		obj.Averagenum();

	}

}
