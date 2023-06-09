package numberpatternprogramming;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5, p = 1;
		for (int i = 1; i < n; i++, p++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(p + "");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(p + "");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < n; k++) {
				System.out.print(p + "");
			}
			for (int l = i; l <= n; l++) {
				System.out.print(p + "");
			}
			System.out.println();
		}
	}
}

//result:-
//1
//222
//33333
//4444444
//55555555555
//666666666
//7777777
//88888
//999
// 10
