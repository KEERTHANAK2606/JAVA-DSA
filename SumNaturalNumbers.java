import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);
    }
}
