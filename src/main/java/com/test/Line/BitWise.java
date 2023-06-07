package com.test.Line;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BitWise {


    public  int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }

    public int decodeArray(int[] encodedArray, int n) {
        int shiftAmount = 1 << (1 << (1 << 1));
        int mask = (1 << shiftAmount) - 1;

        int originalA = 0;
        for (int i = 0; i < n; i++) {
            int encodedValue = encodedArray[i];
            originalA = encodedValue & mask;
            int originalB = (encodedValue >> shiftAmount) & mask;

            encodedArray[i] = originalA;
            // If needed, you can store originalA and originalB in separate arrays
            // or perform any other desired operations with them.
        }

        return originalA;
    }

    public void encodeArray(int []  A, int[]  B) {

        for (int i = 0; i < A.length; i++) {

            A[i] = encodeInteger(A[i], B[i]);
        }
    }
}
