package pract;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 1, p = 0; i <= n; i++, p+=2) {
			for (int j = 1; j <= i; j++) {
				if(i%2==0) {
					System.out.print(2);
				}else {
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
	}

}


//result
//
//1
//22
//111
//2222
//11111