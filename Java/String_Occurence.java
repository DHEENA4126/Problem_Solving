package Zoho;

import java.util.Scanner;
public class String_Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        removeDuplicate(s,len);
    }
    static void removeDuplicate(String s,int n){
        char []t=s.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(t[i]==t[j]){
                    for (int k=j;k<n-1;k++){
                        t[k]=t[k+1];
                    }
                    n--;j--;
                }
            }
        }
        count(t,n,s);
    }
    static void count(char []t,int n,String s){
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(t[i]==s.charAt(j)){
                    c++;
                }
            }
            System.out.print(t[i]+""+c);
        }
    }
}
