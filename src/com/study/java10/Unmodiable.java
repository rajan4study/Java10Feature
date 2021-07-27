/**
 * 
 */
package com.study.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 
 *
 */
public class Unmodiable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list1=List.of(1,2,3,4);
		List<Integer> list2=new ArrayList<>(list1);
		list1.stream().forEach(System.out::println);
		
		list2.add(5);
		list2.stream().forEach(System.out::println);
		
		List<Integer> list3=List.copyOf(list2);
		list3.add(6);
		
		Stream<Integer>stream1=Stream.of(1,2,3,3);
		Set<Integer>set1=stream1.collect(Collectors.toUnmodifiableSet());
		set1.add(8);
		set1.stream().forEach(System.out::println);
	}

}
