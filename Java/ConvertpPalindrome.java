package Zoho;

import java.util.Scanner;

public class ConvertpPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0,a,b,sum=0;
        while(i==0){
            a=rev(num);
            b=rev1(a);
            if(a==b){
                sum=a;
                break;
            }
            else{
                num=a;
            }
        }
        System.out.println(sum);
    }
    static int rev(int n){
        int t=n,r=0;
        while(n>0){
            int temp=n%10;
            r=r*10+temp;
            n/=10;
        }
        int sum=t+r;
        return sum;
    }
    static int rev1(int n){
        int t=n,r=0;
        while(n>0){
            int temp=n%10;
            r=r*10+temp;
            n/=10;
        }

        return r;
    }

}
