package Zoho;

import java.util.Scanner;

public class MonkeyEat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int a[]=new int[n];
        int left=1;
        int right=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(right<a[i]){
                right=a[i];
        }}
            while(left<right){
                int mid=left+(right-left)/2;
                int tot=0;
                for( int j=0;j<n;j++){
                    tot+=Math.round( (float)a[j]/mid);
                }
                    if(tot<=h){
                        right=mid;
                    }
                    else {
                        left=mid+1;
                    }
            }
        System.out.print(left);
    }
}
