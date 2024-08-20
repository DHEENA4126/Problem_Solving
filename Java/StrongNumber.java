package Zoho;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
       int a=strong(num);
       if(a==num)
           System.out.println("Strong Number");
       else
           System.out.println("Not Strong Number");
    }
    static int strong(int n){
        int sum=0;
            while(n>0){
                int sum1=1;
                int temp=n%10;
                for(int i=1;i<=temp;i++){
                    sum1*=i;
                }
                sum+=sum1;
                n/=10;
            }
            return sum;
        }
    }

