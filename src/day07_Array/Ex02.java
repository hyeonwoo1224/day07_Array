package day07_Array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner sc 생성
		String name[] = new String[3];			//name입력받을 3개의 공간 생성
		
		for(int i=0; i<name.length; i++) {		//for문 3개공간 만큼 생성
			System.out.println(i+1+"번째 이름 입력 : ");	//1씩 증가하며 3까지 입력
			name[i] = sc.next();	//1부터 3번째 이름 name에 저장
		}
		for(int i=0; i<name.length; i++) {		//순차적으로 name에 저장된 이름 출력
			System.out.println(i+1+"번째 이름 : "+name[i]);
		}
	}
}
