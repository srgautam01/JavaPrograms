import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main (String[] args){
        // a java program to find the second largest and smallest element in an array.
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is:" + a[n-2]);
        System.out.println("Smallest:" + a[0]);
    }
}
