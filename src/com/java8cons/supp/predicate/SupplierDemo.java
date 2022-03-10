package com.java8cons.supp.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierDemo {

//    implements Supplier<String>{
//	@Override
//	public String get() {
//		return "welcome";
//	}

	public static void main(String[] args) {
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());

		Supplier<String> supplier = () -> "welcome";
		System.out.println(supplier.get());

		List<String> list1 = Arrays.asList("a", "b");
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		
		//generate 5 random numbers between 0 to 10.
		Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
        Stream.generate(randomNumbersSupp)
                        .limit(5)
                        .forEach(System.out::println);
	}


}
