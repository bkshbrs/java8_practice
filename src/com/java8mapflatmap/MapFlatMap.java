package com.java8mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
	public static void main(String[] args) {

		List<Customer> customers = CustomerDatabase.getAll();

		// List<Customer> convert List<String> -> Data Transformation
		// mapping : customer -> customer.getEmail()
		// customer -> customer.getEmail() one to one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails + " -using map");

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers + " -using map");

		// List<Customer> convert List<String> -> Data Transformation
		// mapping : customer -> phone Numbers
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phones + " -using flatmap ");
	}
}
