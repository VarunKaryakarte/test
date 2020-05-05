package com.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String args[]) {
		
		// initialize a list of integers
		List<Integer> list = Arrays.asList(1 , 4 ,5 ,3 ,2 ,3 , 4);
		
	 list.stream().map(x -> x + 1).filter(x -> x % 2 == 0).sorted().forEach(x -> System.out.println(x));
	
		//System.out.println("The new list with only even numbers which is sorted  " +newList);
		
	}
}
