package Zoho;

import java.util.Scanner;

public class MaxPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int e[]=new int[hour];
        int l[]=new int[hour];
        for(int i=0;i<hour;i++){
            e[i]=sc.nextInt();
        }
        for(int i=0;i<hour;i++){
            l[i]=sc.nextInt();
        }
        maxpersonhour(e,l,hour);
    }
    static void maxpersonhour(int a[],int []b,int h){
        int max=0,sum=0,i=0,ch=0;
        while(i<h){
            sum+=a[i]-b[i];
            if(sum>max){
                max=sum;
                ch=i+1;
            }
            i++;
        }
        System.out.println("Current Hour="+ch);
        System.out.println("Maximum Person is="+max);
    }
}
