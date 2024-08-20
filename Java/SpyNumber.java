package Zoho;
import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=sum(num);
        int b=product(num);
         boolean x=Spy(a,b);
         if(x==true){
             System.out.println("Spy Number");
         }
         else {
             System.out.println("Not a Spy Number");
         }
    }
    static boolean Spy(int x,int y){
        return x==y;
    }
    static int sum(int n){
        int s=0;
        while(n>0){
            int temp=n%10;
            s+=temp;
            n/=10;
        }
        return s;
    }
    static int product(int n){
        int p=1;
        while(n>0){
            int temp=n%10;
            p*=temp;
            n/=10;
        }
        return p;
    }
}
