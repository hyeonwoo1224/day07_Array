package day07_Array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner sc ����
		String name[] = new String[3];			//name�Է¹��� 3���� ���� ����
		
		for(int i=0; i<name.length; i++) {		//for�� 3������ ��ŭ ����
			System.out.println(i+1+"��° �̸� �Է� : ");	//1�� �����ϸ� 3���� �Է�
			name[i] = sc.next();	//1���� 3��° �̸� name�� ����
		}
		for(int i=0; i<name.length; i++) {		//���������� name�� ����� �̸� ���
			System.out.println(i+1+"��° �̸� : "+name[i]);
		}
	}
}
