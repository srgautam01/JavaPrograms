import java.util.Scanner;

public class Insert_Array {
    public static void main(String[] args){
        // this program allows the users to insert an element in a specific position
        // in a given array
        int n, pos, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in an array:");
        n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = sc.nextInt();
        for(int i = (n-1); i >= (pos-1); i--){
            a[i+1] = a[i];
        }
        a[pos - 1] =x;
        System.out.print("After inserting:");
        for (int i =0; i<n; i++){
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}
