package Zoho;

import java.util.Scanner;

public class EqualPrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0;
        int arr[] = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        while (i < n) {
            int a = fsum(i, arr);
            int b = lsum(i, n, arr);
            if(a==b){
                System.out.println(arr[i]);
            }
            i++;
        }
    }
     static int fsum(int i,int a[]){
         int sum=0;
         for(int j=0;j<i;j++){
             sum+=a[j];
         }
         return sum;
        }
    static int lsum(int i,int n,int a[]){
        int sum=0;
        for(int j=i+1;j<n;j++){
            sum+=a[j];
        }
        return sum;
    }
}
