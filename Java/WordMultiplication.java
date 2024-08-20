package Zoho;
import java.util.Scanner;
public class WordMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        Word(str, l);
    }
    static void Word(String str, int l) {
        int num,i,j;
        for(i=0;i<l;i++){
              num=0;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                char temp=str.charAt(i-1);
                while(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    num=(num*10)+(str.charAt(i)-48);
                    i++;
                    if(i==l){
                        break;
                    }
                }
                for(j=0;j<num;j++){
                    System.out.print(temp);
                }
            }
        }
    }
}
