package com.WHM0304.hello;

public class HelloB {
	public static void main(String[] args) {
		
		// HelloA 와 다르게 표현하기
		// 변수 선언하기
		
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		int total = 0;
		int avg = 0;
		
		// 변수에 값 설정하기
		// 국어 : 80 , 영어 : 85 , 수학 : 30
		
		scoreKor = 80;
		scoreEng = 85;
		scoreMath = 30;
		total = scoreEng + scoreKor + scoreMath;
		avg = total / 3;
		
		System.out.println("시험점수");
		System.out.println("================");
		System.out.print("국어점수 : ");
		System.out.println(scoreKor);
		System.out.print("영어점수 : ");
		System.out.println(scoreEng);
		System.out.print("수학점수 : ");
		System.out.println(scoreMath);
		System.out.println("================");
		System.out.print("총점 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.println("================");
		
		
		
		
	}

}
