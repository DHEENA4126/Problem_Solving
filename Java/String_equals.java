package Zoho;

import java.util.Scanner;

public class String_equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String s1=sc.next();
        int a=equal(s,s1);
        System.out.print(a==1?"Yes":"No");
    }
    static int equal(String s,String s1){
        int t;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             t =s1.indexOf(c);
             if(t<0)
                 return 0;
        }
        return 1;
    }
}
