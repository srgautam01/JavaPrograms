import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        // this java program finds the simple interest.
        float p,r,t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal:");
        p = sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        r =sc.nextFloat();
        System.out.println("Enter the time period:");
        t = sc.nextFloat();

        float si;
        si = (r*t*p) / 100;
        System.out.print("The simple interest is:" + si);
    }
}
