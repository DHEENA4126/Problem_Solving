package Zoho;

import java.util.Scanner;

public class AmicableNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2:");
        int num2=sc.nextInt();
        int a=factor1(num1);
        int b=factor2(num2);
        if(a==num2 && b==num1)
            System.out.println("Amicable Number");
        else
            System.out.println("Not Amicable Number");
    }
    static int factor1(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
    static int factor2(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}
