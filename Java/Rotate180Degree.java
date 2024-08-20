package Zoho;

import java.util.Scanner;

public class Rotate180Degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int rev= Rotate(num);
       int rotate=0;
       while(rev>0){
           int temp=rev%10;
           rotate=rotate*10+temp;
           rev/=10;
       }
       int sum=rotate+num;
       display(sum);
    }
 static int Rotate(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            switch (digit){
                case 2->digit=5;
                case 5->digit=2;
                case 6->digit=9;
                case 9->digit=6;
            }
            n/=10;
             rev=rev*10+digit;
        }
        return rev;
  }
 static void display(int n){
      System.out.println(n);
  }

}
