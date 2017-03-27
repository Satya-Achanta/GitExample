package com.github.maven.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Number> addArray = new ArrayList<Number>();
		
		addArray.add(1);
		addArray.add(2);
		addArray.add(3);
		
		int sum =0;
		for(Number x : addArray){
			
			sum = sum +x.intValue();
		}
		System.out.println("Sum of array elemets is : "+sum);
		
	}

}
