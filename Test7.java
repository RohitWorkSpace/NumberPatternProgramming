package pract;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 1; i <= n; i++) {
			int p = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(p++);
			}
			System.out.println();
		}
	}

}

//result
//
//12345
//1234
// 123
//  12
//   1
