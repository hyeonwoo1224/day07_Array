package day07_Array;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("¦��,Ȧ�� �Է� : ");
		odd_even = sc.next();
		
		for(int i=0; i<add.length; i++) {	
		
			switch (odd_even) {
			case "¦��":
				if(add[i]%2==0) {
					System.out.println("¦�� : "+add[i]);
				}
					break;
		
			case "Ȧ��":
				if(add[i]%2==1) {
					System.out.println("Ȧ�� : "+add[i]);
				}
					break;
			}
		}
	}
}
