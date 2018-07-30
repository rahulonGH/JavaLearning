package git.Learning;

import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1,2,3,4);
		List<Double> dList = Arrays.asList(1.0,2.5,3.84,4.98);
		System.out.println(iList + "  -  "+dList);
		System.out.println("Sum of Integers: "+doAddition(iList));
		System.out.println("Sum of Doubles: "+doAddition(dList));
		System.out.println("Sum of Integers_LB: "+doAdditionLB(iList));
		//System.out.println("Sum of Doubles_LB: "+doAdditionLB(dList)); //compilation error
		print(iList);
		//print(dList);
		print_UB(iList);
		print_UB(dList);
	}
	
	public static double doAddition(List<? extends Number> lst){ //Upper Bound Wildcard implementation
		double sum =0;
		for(Number n: lst)
			sum += n.doubleValue();
		return sum;
	}
	public static int doAdditionLB(List<? super Integer> lst){ //Lower Bound Wildcard implementation
		int element =0;
		for(Object o: lst)
		{
			element+=Integer.parseInt(o.toString());
		}
		return element;
	}
	public static void print(List<? super Integer> lst){ //Lower Bound wildcard implementation
		for(Object o: lst)
			System.out.println(o);
	}
	public static void print_UB(List<?> lst){  		//Unbound wildcard
		for(Object o: lst)
			System.out.println(o);
	}
}
