package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList name = new ArrayList();
	//이름을 저장할 ArrayList name 생성
	ArrayList num = new ArrayList();
	//번호를 저장할 ArrayList num 생성
	String na, nu;
	//이름,번호를 입력받을 변수 선언
	boolean bool = true;
	//종료했을때 while문을 탈출할 변수 선언
	
	//연락처 프로그램 반복실행
	while(bool) {
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		int input = sc.nextInt();
		//보기 선택받기
		
		switch(input) {
		case 1:
			System.out.println("등록할 이름을 입력하세요");
			na = sc.next();
			//이름이 등록되어 있지 않다면 연락처 저장
			//indexOf는 객체가 없다면 -1 있으면 그 위치를 반환
			//-1이 반환된다는건 중복이 없다는 뜻이다.
			if(name.indexOf(na) == -1) {
				name.add(na);
				System.out.println("등록할 번호를 입력하세요");
				na = sc.next();
				num.add(nu);
				//입력받은 번호를 ArrayList num에 추가
				System.out.println("등록된 이름은 : " + na + " / 번호는 : " + nu);
			} else {
				System.out.println("중복된 이름이 있습니다.");
				//이름이 등록되어 있다면 중복된 이름이 있다고 반환
			}
			break;
		case 2:
			System.out.println("누구의 연락처를 확인하시겠습니까?");
			for(int i=0; i<name.size(); i++) {
				System.out.println("이름 : "+name.get(i));
				//저장되어 있는 모든 이름을 확인
			}
			na = sc.next();
			//확인할 이름의 인덱스 번호 확인
			//name.indexOf(na);
			
			if(name.indexOf(na)== -1) {
				System.out.println("목록에 없습니다.");
			}
			else {
				System.out.println(na + "의 번호는 " + num.get(name.indexOf(na)));
			}
			break;
		}
	}
	}
}
