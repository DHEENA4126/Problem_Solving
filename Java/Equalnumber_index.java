package Zoho;

import java.util.Scanner;

// equal number index subract panni athula minimun value print pannanum
public class Equalnumber_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=equal(n,arr);
        if(sum==0){
            System.out.println(-1);
        }
        else
            System.out.println(sum);
    }
    static int equal(int n,int a[]){
        int min=9,c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c=j-i;
                    break;
                }
            }
            if(min>c){
                min=c;
            }
        }
        return min;
    }
}
