package com.edupalm.arrays;
/**
 * 
 * 1차 정수배열의 CRUD 기능 알기
 * 
 * @author hsuk
 *
 */
public class CRUD {
	static int[] list;
	static int last= -1;// 마지막에 추가(저장)한 요소번호
	
	public static void main(String[] args) {
		list = new int[10];// {2,3,6,14,7,5,9,4,16,25};
		showList(list); // {0}
		addItem(2);		// {2}
		addItem(12);	// {2,12}
		addItem(22);	// {2,12,22}
		addItem(32);	// {2,12,22,32} : last ? 3 + 1 4개를 저장
		showList(list);	
		editItem(2, 222);	// {2,12,222,32}
		showList(list);
		removeItem(1);// {2,222,32} : last ? 2
		addItem(99);	// {2,222,32,99} : last 3
		showList(list);

	}
	
	public static void main01(String[] args) {
		list = new int[10];// .lenght = 10;
		// R: 목록보기(전체 요소들의 값을 출력)
		showList(list);// 출력하려는 배열이 지역인 경우 전달필요
		// 필드 list 뿐만 아니라 다른 배열도 출력 할 수 있게하라...
		// C: 추가하기(번호 지정- 번호의 증갑 ? 0+1)
		addItem(30);// 필드를 사용한다.
		// U: 수정하기(대상을 선택하고 변경할 값을 준다)
		editItem(0, 100);// 선택, 값
		// D: 삭제하기(지운다. 대상을 선택)
		deleteItem(0);
		// D : 삭제하기(당겨채우기, 길이 변결)
		removeItem(0);
	}

	private static void removeItem(int delIndex) {
		// TODO: 1. 인접요소의 값으로 덮어쓴다.
		//		 2. 마지막 요소의 값을 초기화(0) 시킨다.
		for(int i =delIndex; i <list.length-1; i +=1) {
			list[i] = list[i+1];// (i)<length-1
		}
		list[list.length-1]=0;
		last -= 1;// 마지막 번호, 현재 저장된 길이
		
//		[0][1][2]{3}[4][5][6][7][8][9]
//		[0][1][1][0]<[0]<[0]<[0][1][0][0]
	}

	private static void deleteItem(int i) {
		// TODO: 지운다-비어있다.... 공간(변수)은 존재한다..
		list[i] = -100;// 비어있음을 의미하는 값 뭔가요?
		// int : 정수 배열에 저장된 정수들의 정체가 의미가 뭐냐?
		// 점수 : 범위가 뭔데요 : -10 ~ +20
		
		// 삭제할 자리를 인접 요소로 덮어쓴다(당긴다)
		// 삽입, 삭제 시 시간이 걸린다...
		
	}

	private static void editItem(int i, int j) {
		// TODO Auto-generated method stub
		list[i] = j;// 덮어쓴다..
		 
	}

	private static void addItem(int i) {
		// TODO: 배열에 저장하려면 요소번호를 결정
		// 경계선 확인(요소번호의 범위:최대값)
		if((last+1) < list.length) {
			int addIndex = 0;
			// 이 시점에서는 아직 저장하기는 하지 않은 상태
			// >= 0번에 저장할 것이다. 현재 0개 저장되어 있다...
			last += 1;// -1 + 1 = 0
			list[last] = i;// 추가했다.
			// 이 시점에서는 추가한 상태
			// 이 시점에서는 추가한 상태
			// 이 시점에서는 다음에 추가할 번호 1번에 저장할 것이다.
			// 현재 1개 저장되어 있다.
			System.out.println("현재 " + (last+1) + " 개 저장됨");
			// 번호, 길이 : 1차이 ( 0번부터 )
		}else {
			// 배열은 길이가 변하지 않는다.
			System.out.println("Full");
		}
	}

	private static void showList(int[] list) {
		// TODO: 전달받은 정수 배열의 값들을 출력한다.
		// 변수명 같더라도 지역을 우선해서 접근
		for(int i=0;i<list.length; i +=1) {
			// 만약에 필드에 list 있으면 this.list <- 필드
			System.out.println(i+":"+list[i]);
			// 요소번호 : 요소의값
		}
		
	}

}
