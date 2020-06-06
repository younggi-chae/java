package ex.collection4;
import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car");
		set.add("Car"); set.add("disc"); set.add("dance"); set.add("dZZZZ");
		set.add("dzzzz"); set.add("elephant"); set.add("elevator");
		set.add("fan"); set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from" + from + "to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));   //범위검색, 끝은 포함x "d" 포함x
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));

	}

}
