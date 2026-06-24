import java.util.*;
public class FibNo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        while(second<n){
            int next=first+second;
            first=second;
            second=next;
        }
        if(n==0||second==n){
            System.out.print("Fibbonacci Number");
        }
        else{
            System.out.println("Not a Fibbonacci Number");
        }
    }
}
