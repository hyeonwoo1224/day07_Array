package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList name = new ArrayList();
	//�̸��� ������ ArrayList name ����
	ArrayList num = new ArrayList();
	//��ȣ�� ������ ArrayList num ����
	String na, nu;
	//�̸�,��ȣ�� �Է¹��� ���� ����
	boolean bool = true;
	//���������� while���� Ż���� ���� ����
	
	//����ó ���α׷� �ݺ�����
	while(bool) {
		System.out.println("1.����ó ���");
		System.out.println("2.����ó ����");
		System.out.println("3.����ó ����");
		System.out.println("4.��� ����ó ����");
		System.out.println("5.����");
		int input = sc.nextInt();
		//���� ���ùޱ�
		
		switch(input) {
		case 1:
			System.out.println("����� �̸��� �Է��ϼ���");
			na = sc.next();
			//�̸��� ��ϵǾ� ���� �ʴٸ� ����ó ����
			//indexOf�� ��ü�� ���ٸ� -1 ������ �� ��ġ�� ��ȯ
			//-1�� ��ȯ�ȴٴ°� �ߺ��� ���ٴ� ���̴�.
			if(name.indexOf(na) == -1) {
				name.add(na);
				System.out.println("����� ��ȣ�� �Է��ϼ���");
				na = sc.next();
				num.add(nu);
				//�Է¹��� ��ȣ�� ArrayList num�� �߰�
				System.out.println("��ϵ� �̸��� : " + na + " / ��ȣ�� : " + nu);
			} else {
				System.out.println("�ߺ��� �̸��� �ֽ��ϴ�.");
				//�̸��� ��ϵǾ� �ִٸ� �ߺ��� �̸��� �ִٰ� ��ȯ
			}
			break;
		case 2:
			System.out.println("������ ����ó�� Ȯ���Ͻðڽ��ϱ�?");
			for(int i=0; i<name.size(); i++) {
				System.out.println("�̸� : "+name.get(i));
				//����Ǿ� �ִ� ��� �̸��� Ȯ��
			}
			na = sc.next();
			//Ȯ���� �̸��� �ε��� ��ȣ Ȯ��
			//name.indexOf(na);
			
			if(name.indexOf(na)== -1) {
				System.out.println("��Ͽ� �����ϴ�.");
			}
			else {
				System.out.println(na + "�� ��ȣ�� " + num.get(name.indexOf(na)));
			}
			break;
		}
	}
	}
}
