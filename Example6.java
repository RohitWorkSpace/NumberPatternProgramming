package numberpatternprogramming;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + "");
			}
			System.out.println();
		}
	}

}

//result:-
//1
//12
//123
//1234
//12345
//123456