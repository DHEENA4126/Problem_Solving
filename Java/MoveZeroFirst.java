package Zoho;

import java.util.Scanner;

public class MoveZeroFirst {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Move(arr,n);
    }
    static void Move(int a[],int n){
        int a1[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0)
               a1[c++]=a[i];
        }
        for(int i=0;i<n;i++){
          if(a[i]==0){
              a1[c++]=a[i];
          }
        }
    for(int i=0;i<n;i++){
        System.out.print(a1[i]+" ");
    }
    }
}
