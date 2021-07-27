/**
 * 
 */
package com.study.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 
 *
 */
public class OptionalFeature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Optional<List<String>> op1=Optional.ofNullable(list);
		op1.stream().forEach(System.out::print);
		
		String[] strArr=new String[10];
		strArr[1]="abc";
		Optional<String> op2=Optional.ofNullable(strArr[1]);
		op2.ifPresent(System.out::print);
		op2.orElseThrow(NullPointerException::new);
	}

}
