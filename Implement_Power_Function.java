import java.util.Scanner;

public class Implement_Power_Function {
    public static int pow(int a, int n, int m) {
        if (n == 0) return 1;
        if (n == 1) return a;
        int p = pow(a, n / 2, m);
        if (n % 2 == 0) return (p * p) % n;
        if (n % 2 == 1) return (p * p * a) % n;


        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println( Implement_Power_Function.pow(a,n,m));
    }
}
