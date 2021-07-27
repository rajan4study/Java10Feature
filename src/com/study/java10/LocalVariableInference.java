/**
 * 
 */
package com.study.java10;

/**
 * @author
 *
 */
public class LocalVariableInference {
	//not allowed
	//private var xyz="xyz";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var x="xyz";
		call(x);
		for(var i=0;i<5;i++) {
			System.out.println(i);
		}
	}

	private static void call(String x) {
		System.out.println(x);
		
	}

}
