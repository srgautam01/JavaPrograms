import java.util.Scanner;

public class Main102 {
    public static void main(String[] args){
        // this program allows users to input the bit values and add it accordingly.
        long b1, b2;  // two variables to hold two input binary numbers
        int i =0, carry =0; // int with carry over is defined

        // hold the output binary number defined by the users
        int[] sum = new int[10];

        // read the input binary numbers defined by the users
            Scanner  sc = new Scanner(System.in);

            // get first input from the users
        System.out.println("Enter the first binary numbers from the user: ");
        b1 = sc.nextLong();

        // get second binary numbers from the users
        System.out.println("Enter the second binary numbers from the user: ");
        b2 = sc.nextLong();

        // close the scanner for the avoid of excessive memory use
        sc.close();

        while(b1 != 0 || b2 != 0){
        sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
        carry = (int)((b1 % 10 + b2 % 10 + carry)/2);
       b1 = b1 / 10;
       b2 = b2 / 10;

    }
        if (carry != 0){
            sum[i++] = carry;
        }
        --i;
        System.out.println("Output: ");
        while (i >= 0){
            System.out.println(sum[i--]);
        }
        System.out.println("\n");
    }

}
