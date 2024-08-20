package Zoho;

import java.util.Scanner;

public class Height_Short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Heightsort(arr,n);
    }
    static void Heightsort(int a[],int n){
        int i=0,j=n-1,c=0;
        int a1[]=new int[n];
        while(c<n){
            if(i==j){
                a1[c++]=a[i];
            }
            else{
            a1[c++]=a[i];
            a1[c++]=a[j];
            }
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            System.out.print(a1[i]+" ");
        }
    }
}
