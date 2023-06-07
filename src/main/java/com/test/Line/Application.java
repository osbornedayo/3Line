package com.test.Line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		BitWise bitWise=new BitWise();

		int[] arr = new int[] {2,4,2,9,1,3,0};
		int[] arr2 = new int[] {3,4,2,4,1,3,6};

		bitWise.encodeArray(arr, arr2);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		bitWise.decodeArray(arr, arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


//		Regarding the classification of the algorithm in terms of Big O notation,
//		the encodeArray function has a time complexity of O(n) because it iterates
//		over each element of the arrays A and B. The decodeArray function also has
//		a time complexity of O(n) because it performs the reverse process for each element.
//		Therefore, both the encoding and decoding processes
//		have a linear time complexity, O(n), where n is the size of the arrays
//

	}

}
