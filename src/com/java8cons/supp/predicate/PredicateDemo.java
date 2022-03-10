package com.java8cons.supp.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

//implements Predicate<Integer>{
//@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}
//		else {
//		return false;
//		}

	public static void main(String[] args) {
//	Predicate<Integer> predicate = new PredicateDemo();
//	System.out.println(predicate.test(4));

		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(7));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(testing()).forEach(t -> System.out.println("print even : " + t));
        
		//print the values from list which are >5 and <8
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // multiple filters
        List<Integer> collect = list.stream()
                .filter(x -> x > 5 && x < 8).collect(Collectors.toList());

        System.out.println(collect);
	}

	private static Predicate<Integer> testing() {
		return t -> t % 2 == 0;
	}

}
