package com.java8cons.supp.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


public static void main(String[] args) {
	/*Consumer<Integer> consumer = t->System.out.println("printing "+ t);
	consumer.accept(10);*/
	
//	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//
//	list1.stream().forEach(t -> System.out.println("print  : " + t));
//	
//	List<String> list2 = Arrays.asList("anil","bksh","daman","sunil");
//
//	list2.stream().forEach(t -> System.out.println("print  : " + t));
//	
	// forEach method to accept Consumer as an argument; this time, we will print the length of the string.
	List<String> list = Arrays.asList("a", "ab", "abc");
    forEach(list, (String x) -> System.out.println(x.length()));

}

static <T> void forEach(List<T> list, Consumer<T> consumer) {
    for (T t : list) {
        consumer.accept(t);
    }
}

	
}

