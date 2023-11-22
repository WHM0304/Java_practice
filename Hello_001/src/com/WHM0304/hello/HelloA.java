package com.WHM0304.hello;

public class HelloA {
	public static void main(String[] args) {
		
		
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
		System.out.println("국어점수 : " + scoreKor);
		System.out.println("영어점수 : " + scoreEng);
		System.out.println("수학점수 : " + scoreMath);
		System.out.println("================");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("================");
		
		
		
		
	}

}
