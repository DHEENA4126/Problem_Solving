package Zoho;

import java.util.Scanner;

public class PivotNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num,c=0;

       while(n>0){
        int a=fsum(n);
         int b=lsum(n,num);

           if(a==b){
               System.out.println(n);
               c++;
               break;
           }
           n--;
       }
       if(c==0){
           System.out.println("No Pivot Number for Given Number");
       }

    }
    static int fsum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=i;
        }
        return sum;
    }
    static int lsum(int n,int num){
        int sum=0;
        for(int i=n+1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

}
