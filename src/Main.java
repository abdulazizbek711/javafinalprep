import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    //The 1st problem           =====>>>>>>

    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = z.nextInt();
        System.out.println("The factorial of the number is " + factorial(a));
    }
    public static int factorial(int a) {
        if (a==1) {
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }


    //The 2nd problem ======>>>>>>>>>>>
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("The max number is "+ Collections.max(numbers));
        System.out.println("The min number is "+ Collections.min(numbers));
        Collections.sort(numbers);
        System.out.println("The sorted arraylist is " + numbers);
        Collections.reverse(numbers);
        System.out.println("The reverse sorted arraylist is " + numbers);
    }



    //The 3rd problem ===========>>>>>>>>>>>>


    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = z.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = z.nextInt();
        int A[][]= new int[r][c];
        int B[][]=new int[r][c];
        int C[][]=new int[r][c];
        for (int i =0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.println("Enter the elements of the matrix A: ");
                A[i][j]=z.nextInt();
            }
        }
        for (int i =0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.println("Enter the elements of the matrix B: ");
                B[i][j]=z.nextInt();
            }
        }
        for (int i =0;i<r;i++) {
            for (int j=0;j<c;j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int i =0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
    }


    //The 4th problem ========>>>>>>>>>.


    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the length of height: ");
        int height = z.nextInt();
        System.out.println("Enter the length of base: ");
        int base = z.nextInt();
        Rectangle Ok = new Rectangle(base,height);
        System.out.println("The area of rectangle is " + Ok.FindArea());
        System.out.println("The perimeter of rectangle is " + Ok.FindPerimetr());
    }

}
