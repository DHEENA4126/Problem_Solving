package Zoho;
import java.util.*;
public class SubArrayMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max=0, tag=0;
        for (int i=0;i<n;i++){
            tag+=a[i];
            if(tag>max)
                max=tag;
            if(tag<0)
                tag=0;
        }
        System.out.println(max);

    }
}