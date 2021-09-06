import java.util.Scanner;

public class Bit_Position {
    public static void main(String[] args){
        // this program checks if a given bit position is set to one or not
        int n,m;
        String x = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Decimal Number:");
        n = sc.nextInt();
        while(n > 0){
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println("Enter the position you want to check:");
        int l = x.length();
        m = sc.nextInt();
        if((l-m) >= 0 && (x.charAt(l -m) == '1')){
            System.out.println("1 is present at given bit position");
        }else{
            System.out.println("0 is present at given bit position");
        }
    }
}
