package jan30th;

import java.util.Scanner;

public class OperatorsDemo6 {

	public static void main(String[] args) {

		// ternary operator

		System.out.println("Enter some integer value for x : ");

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();

		/*
		 * if (x >= 0) { System.out.println("+ve"); } else { System.out.println("-ve");
		 * }
		 */
		
		System.out.println((x>0)?"+ve":"-ve");
		
		//int result="Apple"+123;
		System.out.println("Apple"+123);
		
		System.out.println(12+13);
		

	}

}
