package Zoho;
import java.util.Scanner;

class Stack{
    int s[];
    int top;
    Stack(int size){
        s=new int[size];
        top=-1;
    }
    void push(int data){
        if(top==s.length-1){
            System.out.println("Stack was Full");
        }
        else {
            s[++top]=data;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack empty");
        }
        else{
            top--;
        }
        return 0;
    }
    void display(){
        for(int i=top; i>=0; i--){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
public class L2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s =new Stack(n);
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.print("Do you want pop the Value press 1");
        int val=sc.nextInt();
        System.out.println("How many times you want pop:");
        if(val==1){
            int times=sc.nextInt();
            for(int i=0;i< times;i++){
                s.pop();
            }
        }
        else {
            s.display();
        }
        s.display();
    }
}