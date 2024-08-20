package Zoho;
import java.util.Scanner;
public class WaterFilter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        max(arr,n,max);
    }
    static void max(int a[],int n,int max){
        int i,j,sum=0;
        for(i=0;i<n;i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int smax=a[n-2];
       for(i=0;i<n-2;i++){
           sum+=smax-a[i];
       }
       System.out.print(sum);
    }
}
