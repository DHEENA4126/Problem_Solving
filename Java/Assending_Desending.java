package Zoho;
import java.util.*;
public class Assending_Desending {// fisrt half assending and second half desending

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        Assending(a,n);
        Desending(a,n);
        Display(a,n);
    }
    static int[] Assending(int []a,int n){
        for(int i=0;i<(n/2)-1;i++){
            for(int j=i+1;j<n/2;j++){
            if(a[i]>a[j]){
                a[i]=a[i]^a[j];
                a[j]=a[i]^a[j];
                a[i]=a[i]^a[j];
            }
        }
        }
      return a;
    }
    static int[] Desending(int a[],int n){
        for(int i=n/2;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    a[i]=a[i]^a[j];
                    a[j]=a[i]^a[j];
                    a[i]=a[i]^a[j];
                }
            }
        }
       return a;
    }
    static void Display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
