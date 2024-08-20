package Zoho;

public class Problem3 {
    public static void main(String[] args) {
        String str="dheena4126@gmail.com";
        int len=str.length();
        int at=0,st=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='@') {
                at = i;
            }
            else if(str.charAt(i)=='.'){
                st=i;
                }
        }
        System.out.println(st);
       Starconvert(str,at,st);
    }

    static void Starconvert(String str,int a,int s){
        char ca[]=str.toCharArray();
        int at=a-2;
        for(int i=2;i<s;i++){
            if((i>at && i<=a+2)||(i>=s-2)){
                continue;
            }
           else if(ca[i]>=96 && ca[i]<=122){
               ca[i]='*';
            }
        }
        for(int i=0;i< ca.length;i++){

            System.out.print(ca[i]);
        }

    }
}
