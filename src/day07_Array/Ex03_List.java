package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack...���� �ִ�.
		 ArrayList
		 - �����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		 - �ߺ��� �����͸� ������ �� �ִ�
		 - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�
		 - ������ ũ�⸦ ���´�
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("123"));
		//arr�̶�� ������ 123 �̶�� ���� �ִ��� Ȯ�� true,false�� ��� ���
		System.out.println(arr.remove(1));
		//"123" 123�̶�� �� ����
		//0,1 �������� ���� ����
		System.out.println(arr);
		//456�� ���Ե�
		System.out.println(arr.get(0));
		
		arr.clear();
		System.out.println("���� �� arr : " + arr);
	}
}