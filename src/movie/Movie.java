package movie;

import java.util.Scanner;

/*
 1. 프로젝트명 : 영화 예매 하기(MovieTicketProject)
   패키지명 : movie
2. 클래스명 : MovieMain.java -- main( )가 있는 경우(Movie.java--라이브러리클래스)
3. 생성자 초기값 넣기로 자료를 넣어 주세요.
     입력자료 : 영화명, 금액, 나이, 구매방법(현장, 인터넷, 쿠폰)
  실구매금액조건 
        1) 나이가 20미만이면 25% 할인, 나이가 20~30이면 20%할인, 30이상이면 15%할인
        2) 현장구매인 경우 0%할인, 인터넷 구매인 경우 추가 5%할인, 쿠폰구매인 경우 10%할인
             예) 1째줄은 11000 * 70% = 7700
                  2째줄은 15000 * (100%-20%) = 12000
                  3째줄은 12500 * (100%-(15%+10%)) = 9375
4. 입력자료
1째 레코드(줄) => 1917 11000 10 인터넷
2째 레코드(줄)==> 주디 1500025 현장
3째 레코드(줄)==> 인비저블맨 12500 40 쿠폰
 */

public class Movie {
	
	String movieName; // 영화명
	int price; // 금액
	int age; // 나이
	int money; // 실구매금액
	double rate; // 할인율
	String way; // 구매방법
	
	public Movie(String movieName, int price, int age, String way) {
		this.movieName = movieName;
		this.price = price;
		this.age = age;
		this.way = way;
	}

	void rateCal() { // 할인율
		switch (way) {
			case "쿠폰" :
				rate=0.1;
				
				break; // 브레이크로 스위치문을 멈춰준다.
				
			case "인터넷" :
				rate=0.05;
				
				break;
				
			case "현장" :
				rate=0;
				break;
		}
				
				if(age>=30) 
					rate+=0.15;
				else if (age>=20)
					rate+=0.2;
				else
					rate+=0.25;
		
		}
	
	
		void moneyCal() {// 실구매금액
	 money = (int)(price-(price*rate));
		}
	
		
		void titlePrint() {//제목인쇄하기
		System.out.println("영화명\t\t" + "금액\t\t"+"나이\t\t" + "실구매금액");
		}
		
	
		void dataPrint() { // 내용출력하기
			rateCal();
			moneyCal();
	System.out.println(movieName+"\t" + price + "\t\t" + age + "\t\t" + money);
	
	
	
		}
	}

