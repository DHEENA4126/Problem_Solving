package Zoho;
import java.util.Scanner;
public class NextLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,2,2,1,1};
        int n=arr.length;
        Nextlarge(arr,n);
    }
    static void Nextlarge(int a[],int n){
        int m=0,i,j;
        int temp[]=new int[n];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    temp[m++]=a[j];
                    break;
                }
            }
        }
        for(i=0;i<n;i++){
            if(temp[i]==0){
                temp[i]=-1;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
