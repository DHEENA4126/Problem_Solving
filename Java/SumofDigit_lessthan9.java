package Zoho;

import java.util.Scanner;

public class SumofDigit_lessthan9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        digit(num);
    }
    static void digit(int n){
        int num,a=0;
        while(a==0){
            num=0;
            if(n<10){
              break;
            }
            else{
                while (n>0){
                    int temp=n%10;
                    num+=temp;
                    n/=10;
                }
            }
            n=num;
        }
        System.out.println(n);
    }
}
