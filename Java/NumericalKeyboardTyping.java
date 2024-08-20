package Zoho;

public class NumericalKeyboardTyping {
    public static void main(String[] args) {
        String str="sour mango";
        int key=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char a=str.charAt(i);
            switch(a){
                case 1:
                    System.out.print(1);
                    break;
                case 32:
                    System.out.print(0);
                    break;
                case 'a','b','c':
                    if(a=='a'){
                        System.out.print(2);
                    } else if (a=='b') {
                        System.out.print(22);
                    }
                    else {
                        System.out.println(222);
                    }
                    break;
                case 'd','e','f':
                    if(a=='d'){
                        System.out.print(3);
                    } else if (a=='e') {
                        System.out.print(33);
                    }
                    else {
                        System.out.println(333);
                    }
                    break;
                case 'g','h','i':
                    if(a=='g'){
                        System.out.print(4);
                    } else if (a=='h') {
                        System.out.print(44);
                    }
                    else {
                        System.out.println(444);
                    }
                    break;
                case 'j','k','l':
                    if(a=='j'){
                        System.out.print(5);
                    } else if (a=='k') {
                        System.out.print(55);
                    }
                    else {
                        System.out.println(555);
                    }
                    break;
                case 'm','n','o':
                    if(a=='m'){
                        System.out.print(6);
                    } else if (a=='n') {
                        System.out.print(66);
                    }
                    else {
                        System.out.print(666);
                    }
                    break;
                case 'p','q','r','s':
                    if(a=='p'){
                        System.out.print(7);
                    } else if (a=='q') {
                        System.out.print(77);
                    }
                    else if(a=='r') {
                        System.out.print(777);
                    }
                    else {
                        System.out.print(7777);
                    }
                    break;
                case 't','u','v':
                    if(a=='t'){
                        System.out.print(8);
                    } else if (a=='u') {
                        System.out.print(88);
                    }
                    else {
                        System.out.print(888);
                    }
                    break;
                case 'w','x','y','z':
                    if(a=='w'){
                        System.out.print(9);
                    } else if (a=='x') {
                        System.out.print(99);
                    }
                    else if(a=='y') {
                        System.out.print(999);
                    }
                    else {
                        System.out.print(9999);
                    }
                    break;
            }
        }
    }
}
