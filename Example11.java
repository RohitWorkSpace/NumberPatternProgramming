package numberpatternprogramming;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+"");
			}
			System.out.println();
		}
	}

}
//result:-
//
//5
//44
//333
//2222
//11111
