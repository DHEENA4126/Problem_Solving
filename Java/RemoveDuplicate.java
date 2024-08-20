package Zoho;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        remove(a,n);
    }
    static void remove(int a[],int n){
        int i,j,k;
        for( i=0;i<n;i++){
            for( j=i+1;j<n;j++){
                if (a[i]==a[j]){
                    for( k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                    k--;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
