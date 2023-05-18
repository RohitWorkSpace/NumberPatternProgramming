package numberpatternprogramming;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + "");
			}
			System.out.println();
		}
	}

}

//result:-
//1
//22
//333
//4444
//55555
//666666