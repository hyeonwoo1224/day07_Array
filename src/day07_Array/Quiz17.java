package day07_Array;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("礎熱,�汝� 殮溘 : ");
		odd_even = sc.next();
		
		for(int i=0; i<add.length; i++) {	
		
			switch (odd_even) {
			case "礎熱":
				if(add[i]%2==0) {
					System.out.println("礎熱 : "+add[i]);
				}
					break;
		
			case "�汝�":
				if(add[i]%2==1) {
					System.out.println("�汝� : "+add[i]);
				}
					break;
			}
		}
	}
}
