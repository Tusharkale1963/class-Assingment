package Com.Assignment_5;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println(" plz enter month number = ");
    	int month=sc.nextInt();
    	switch(month) {
    	case 1:System.out.println("JAN");
    	break;
    	case 2:System.out.println("FEB");
    	break;
    	case 3:System.out.println("MARCH");
    	break;
    	case 4:System.out.println("APRIL");
    	break;
    	case 5:System.out.println("MAY");
    	break;
    	case 6:System.out.println("JUNE");
    	break;
    	case 7:System.out.println("JUILY");
    	break;
    	case 8:System.out.println("OGAST");
    	break;
    	case 9:System.out.println("SABTEBAER");
    	break;
    	case 10:System.out.println("OGTOBER");
    	break;
    	case 11:System.out.println("NOHEMBER");
    	break;
    	case 12:System.out.println("DISEMBER");
    	break;
    	default:{System.out.println(" plz enter valid number ");
    	}
    }
}}
