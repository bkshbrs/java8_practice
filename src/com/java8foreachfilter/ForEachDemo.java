package com.java8foreachfilter;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("bikash", "rabi", "prabal", "muduli");

		// print all values in list using lambda expression
		list.stream().forEach(t -> System.out.println(t));

		// print the values starting with "r"
		list.stream().filter(t -> t.startsWith("r")).forEach(t -> System.out.println(t));

	}

}
