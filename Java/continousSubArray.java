package Zoho;
import java.util.*;
public class continousSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        subArray(a,n);
    }
  static  void subArray(int []a,int l){
        int n=0;
       while(n<l){
          for(int i=n;i<l;i++){
              for(int j=n;j<=i;j++){
                  System.out.print(a[j]);
              }
              System.out.println();
          }
          n++;
       }
    }
}