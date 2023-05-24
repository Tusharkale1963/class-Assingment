package Com.assinment_7;

public class Factorial_Display {
	int n1;

	public int factorialmethod(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
			}
		}
		return n1;
	}
}
