package Zoho;

import java.util.Scanner;

public class Xparttennumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),i,j;
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                if(i+j==num && i==j){
                    continue;
                }
                if(i==j) {
                    System.out.print(1);}
                else if(i+j==num){
                        System.out.print(2);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
