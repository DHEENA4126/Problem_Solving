package Zoho;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int a=sum(num);
       int r= reverse(a);
       magic(a,r,num);
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
    static int reverse(int n){
        int r=0;
        while(n>0){
            int temp=n%10;
            r=r*10+temp;
            n/=10;
        }
        return r;
    }
    static void magic(int a,int b,int n){
        if(a*b==n)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
