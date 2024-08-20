package Zoho;

import java.util.Scanner;

public class DiscariumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int l=len(num);
        int sum=dis(l,num);
        if(sum==num)
            System.out.println("Discarium Number");
        else
            System.out.println("Not a Discarium Number");
    }
    static int len(int n){
        int c=0;
        while (n>0){
            c++;
            n/=10;
        }
        return c;
    }
   static int dis(int l,int num){
        int sum1=0;
        while(num>0){
            int sum=1;
            int temp=num%10;
            for(int i=0;i<l;i++){
                sum*=temp;
            }
            sum1+=sum;
            l--;
            num/=10;
        }
        return sum1;
    }
}
