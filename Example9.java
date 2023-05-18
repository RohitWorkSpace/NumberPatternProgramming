package numberpatternprogramming;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(i + j + 1 + " ");
			}
			System.out.println();
		}
	}

}

//result:-
//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
//4 5 
//5 