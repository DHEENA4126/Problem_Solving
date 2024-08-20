package Zoho;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int r=0,len=s.length(),num=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
                num = num * 10 + s.charAt(i) - '0';
            }

        }

    }

}
