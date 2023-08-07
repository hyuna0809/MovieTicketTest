package movie;

public class MovieMain {

	public static void main(String[] args) {
		
		// Movie클래스의 생성자를 값을 넣어주면서 객체화
		Movie m1 = new Movie("1917\t",11000, 10, "인터넷");
		Movie m2 = new Movie("주디\t",15000, 25, "현장"); 
		Movie m3 = new Movie("인비저블맨",12500, 40, "쿠폰");
		
		
		
		//Movie클래스의 메서드를 호출
		
		m1.titlePrint();
		
		m1.dataPrint();
		m2.dataPrint();
		
		m3.dataPrint();
		
		
		
		
		
		
		
		}

	}


