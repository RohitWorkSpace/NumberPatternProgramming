package pract;

public class Test1 {

	public void increasingTriangle() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void decreasingTriangle() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t = new Test1();
		t.increasingTriangle();
		t.decreasingTriangle();

	}

}
