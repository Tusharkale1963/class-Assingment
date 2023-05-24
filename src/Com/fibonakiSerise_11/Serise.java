package Com.fibonakiSerise_11;

public class Serise {
		int num=0;
		int num1=1;
		int sum;
		
		public void m() {
			System.out.print(num+" "+num1+" ");
			for(int i=2;i<=20;i++) {
		    
		    sum=num+num1;
		     System.out.print(sum+" ");
		     num=num1;
		     num1=sum; // swaping kara lagte bas te pan khali 
			 
			}
			
		}
	public static void main(String[] args) {
		Serise obj=new Serise();
		obj.m();

	}
 //0  1  1  2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10 10 11 
}//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
// 0  1  1   2 3  5  8  13  21  34  55  89  144  233  377  610  987 1597 2584 4181 6765 10946  
//0 1 3 6 10 15 21 28 36 45 55 







