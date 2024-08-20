package Zoho;

import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int temp=num%10;
         sum+=isprime(temp);
            num/=10;
        }
        System.out.println(sum);
    }
    static int isprime(int n){
        int flag=0,prime=0;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                flag++;
            }
        }
            if(flag==0 && n!=1){
                prime=n;
            }
        return prime;
    }
}
