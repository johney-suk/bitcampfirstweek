package com.edupalm;

/**
 * 
 * 비트연산자: 저수준(하드웨어를 제어), 암호, 이미지 처리
 * - 결과는 정수- 2진수로 생각하도록 한다. (계산기)
 * 
 * AND, OR, XOR(다르면 1이다)
 * - 참(1), 거짓(0)
 * 
 * 기능(처리)
 * 1. 특정 비트의 값을 확인 -masking
 * 2. 특정 비트의 값을 1로 만들기 - set
 * 3. 특정 비트의 값을 0로 만들기 - clear
 * 
 * &	AND
 * |	OR
 * ^	XOR 다르면 1
 * ~	1의 보수
 * <<	높은쪽으로 이동 [high] << [low]
 * >>	낮은쪽으로 이동
 * 
 * @author hsuk
 *
 */
public class ExBitwise {

	public static void main(String[] args) {
		// 암호 원값->암호화->알기어려운값->복호화->원값
		// 이미지 필터링( 특정 색을 없애거나, 윤관선 그리기 )
		char origin = 'A';
		char private_key = 'x'; // 인증값
		char public_key = 'y'; // 인증값
		char encypt = (char)(origin^ public_key ^ private_key);// 비트연산의 결과는 정수->int
		System.out.println(origin+"->"+encypt);// 암호화된 값
		char decypt = (char)(encypt ^ public_key ^ private_key);
		System.out.println(encypt+"->"+decypt);// 복호화된 값

	}
	
	public static void main06(String[] args) {
		// XOR : 특징은 원래 값으로 되돌아간다.	toggle
		//	{1} ^ 1 = {0} ^ 1 = {1}
		int n = 0xFF; // 11111111
		int a = 0xFF;
		int m = n ^ a;
		System.out.println( m );// m <-> n
		int k = m ^ a;
		System.out.println( k );// == n
			
	}
	
	public static void main05(String[] args) {
		// [5]번 비트만 0으로 만들고, 나머지는 그대로 둔다...
		int n = 0x75;
		System.out.println(n);

		n= n & (~(1<<5)); // [5]만 0인 값
		System.out.println(n);

	}
	
	public static void main04(String[] args) {
		// 보수 연산 ~ (틸트) : 1은 0으로, 0은 1로 반전시킨다..
		// 보수 관계 두 값을 더해서 최대값일 때
		int n = 10; // 1010
		System.out.println(n);
		n = ~n;// 0101
		System.out.println("보수 "+(n+1));// 2의 보수: 1의보수 +1 <- 음수 값으로 본다
		// 1111
	
	
	}	
	public static void main03(String[] args) {
		//[5번] 비트는 1이 되고, 나머지 비트 값은 유지한다.
		int n =0x75;//01110101 - 지금 현재 [5번]비트 값은 1인 상태
		n = n | (1<<5);// 논리합(자리올림없음)		산술합 자리올림
		System.out.println( n );// 출력 10진 정수
		
		
	}
	
	public static void main02(String[] args) {
		// 특정 비트가 1인 값을 만들자
		// [3번] 비트가 1인값을 출력하세요. 00000000001000
		// 쉬프트 연산 : << left.high   >> right.low
		int n = 1;	// 000000100 << 2번 왼쪽(높은자리)으로 이동시켜라
		n = n << 3;//번 올린다
		System.out.println( n );	// [3]번 비트 1인 값 
		n = n >> 3;//번 내린다.
		System.out.println( n );	// [0]번 비트 1인 값 
		

	}
	
	public static void main01(String[] args) {
			// 오른쪽 [0번] 왼쪽으로 높은 번호 부여
			int n = 10; // 1010 32비트 [31] - [0]
			n = n & 7; // AND 0이면 0이다. - set
			// 1010 -> 10
			// 0111 -> 7	n 변수의 3번 비트를 0으로 만들겠다.
			// 0010 -> 2	n 변수의 나머지 비트들은 그대로 두고.
			System.out.println(n);
			// 0010 -> [2]번 비트만 1로 만들고 싶다...
			// 0100 ->
			// 0110 논리합-산술합은 자리올림 생긴다.   
			n = n | 4; // 0100 <- [2]번만 1인 값으로
			//0110 -> 6
			
	}

}
