package ex.enum1;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		  
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("d1 == d2 ? " + (d1 == d2));  // == 연산자로 비교 가능
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? " + (d1 > d3));   //에러 >, < 연산자 사용불가
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3)); // 0 이면 같다
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2)); // 음수면 오른쪽이크다
		
		switch(d1) {    //enum을 통해 switch문도 활용가능
		       case EAST : 
		    	   System.out.println("The direction is EAST.");
		    	   break;
		       case SOUTH : 
		    	   System.out.println("The direction is SOUTH.");
		    	   break;
		       case WEST : 
		    	   System.out.println("The direction is WEST.");
		    	   break;
		       case NORTH : 
		    	   System.out.println("The direction is NORTH.");
		    	   break;
		       default : 
		    	   System.out.println("Invalid direction.");
		    	   break;
		}
		
		Direction[] dArr = Direction.values(); // values()는 열거형의 모든 상수를 배열에 담아 반환
		
		for(Direction d : dArr)
			System.out.println(d.name() + " = " + d.ordinal()); // ordinal은 정의된 순서를 반환(0부터시작)
	}                                                           // 사용자제.. 상수의 값이 불규칙한 경우 내부적 용도
  
}
