import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter the nth term of fibonacci series :");
        Scanner deva =new Scanner(System.in);
        n=deva.nextInt();
        deva.close();
        int value[]=new int[n];
        value[0]=0;
        value[1]=1;
        System.out.println("The series are :");
        System.out.println(value[0]);
        System.out.println(value[1]);
        for(i=2;i<n;i++)
        {
            value[i]=value[i-1]+value[i-2];
            System.out.println(value[i]);
        }
        
    }
}
