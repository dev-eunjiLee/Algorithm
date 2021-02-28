package backjoon_recursion;

import java.util.Scanner;

public class Q10872_factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int param = sc.nextInt();
		
		int total = 1;
		
		for(int i = 1; i<=param; i++) {
			
			total *= i;
			
		}
		
		if(total == 0) {
			total = 1;
		}
		
		System.out.println(total);
		
		sc.close();

	}
	
}
