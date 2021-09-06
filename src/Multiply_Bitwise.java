import java.util.Scanner;

public class Multiply_Bitwise {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        int mul = n << 2;
        System.out.println("Answer:"+mul);
    }
}
