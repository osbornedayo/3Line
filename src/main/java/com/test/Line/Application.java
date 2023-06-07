package com.test.Line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		BitWise bitWise=new BitWise();

		int[] array1 = new int[] {2,4,2,9,1,3,0};
		int[] array2 = new int[] {3,4,2,4,1,3,6};

		bitWise.encodeArray(array1, array2);
		for(int i=0; i<array1.length; i++) {
			System.out.print("This is the Encoded ARRAY "+array1[i] + " ");
		}

		System.out.println();

		bitWise.decodeArray(array1, array1.length);
		for(int i=0; i<array1.length; i++) {
			System.out.print("This is decoded array  "+array1[i] + " ");
		}

	}

}
