package Com.primenumber_upto_100;

public class Primenumber {
	public void method() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.print(i + " ");
			} else {
				count = 0;// loop samplya nantr count zero zala pahije 
			} // count zero ghye lagte nahitr vande hote
			// mip stape ahe hi
		}
	}
}
