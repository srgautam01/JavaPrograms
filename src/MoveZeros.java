/*  Moving zeroes to the left in an array without changing the position of other numbers
* Input : 6, 5, 4, 0, 1, 0, 4, 0, 0, 7, 3, 2, 0, 7
* Output: 0, 0, 0, 0, 0, 6, 5, 4, 1, 4, 7, 3, 2, 7
*
*
* */


import java.util.Arrays;

public class MoveZeros {
    static void moveZerosToLeft(int[] A){
        if (A.length < 1){
            return;
        }

        int writeIndex = A.length -1;
        int readIndex = A.length -1;

        while(readIndex >= 0){
            if(A[readIndex] !=0){
                A[writeIndex] = A[readIndex];

                writeIndex--;
            }
            readIndex--;
        }
        while(writeIndex >= 0){
            A[writeIndex] = 0;
            writeIndex--;
        }
    }
    public static void main(String[] args){
        int[] v = new int[]{6, 5, 4, 0, 1, 0, 4, 0, 0, 7, 3, 2, 0, 7};
        System.out.println("Original Array: " + Arrays.toString(v));

        moveZerosToLeft(v);

        System.out.println("After Moving Zeros to Left:" + Arrays.toString(v));
    }
}
