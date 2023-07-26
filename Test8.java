package pract;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		for (int i = 1, k = n; i <= n; i++) {
			int p = k;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int l = i; l <= n; l++) {
				System.out.print(p--);
			}
			System.out.println();
		}
	}

}
