
#야구게임	v 팀전
> 자바 1주차 팀별 과제

## 플레이어 2명 서로 상대의 수를 맞춘다.
1. 각자 자신의 정답 정하기 필드 answer =
2. caller -> replier.reply() : 스트라이크[0], 볼[1] 
3. caller.predict();
4. 역할 바꾸기
5. 정답을 먼저 맞추면 승자 종료
6. 전체 팀을 모두 시합 - 승자 점수

## 산출물(팀별)
Team0x.java
.call();	// predict 함수에서 계산한 걸 반환:
//.reply(value);
.predict(strike, ball);
	// 내가 부른 값에 대해 상대방이 대답한 전달된다.
	// 다음에 부를 값을 call 함수에서 반환있게 연결(필드)
	
	
각자 함수를 하나씩 만들어서 사용
.predict(){
	a();
	b();
	c();
	}