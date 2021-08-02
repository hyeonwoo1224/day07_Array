package day07_Array;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("Â¦¼ö,È¦¼ö ÀÔ·Â : ");
		odd_even = sc.next();
		
		for(int i=0; i<add.length; i++) {	
		
			switch (odd_even) {
			case "Â¦¼ö":
				if(add[i]%2==0) {
					System.out.println("Â¦¼ö : "+add[i]);
				}
					break;
		
			case "È¦¼ö":
				if(add[i]%2==1) {
					System.out.println("È¦¼ö : "+add[i]);
				}
					break;
			}
		}
	}
}
