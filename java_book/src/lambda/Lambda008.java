package lambda;

//메서드 반환값으로 람다식(함수형 인터페이스) 사용
public class Lambda008 {

	public static void main(String[] args) {
		MyFunctionalInterface mfi = todo();
		
		int result = mfi.runSomething(5);
		
		System.out.println(result);

	}
	
	public static MyFunctionalInterface todo() {
		return num -> num * num;
	}

}
