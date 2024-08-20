package Zoho;

import java.util.Scanner;

public class SeriesPartten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        partten( num);
    }

    static void partten(int n) {
        int num = 1;
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num+" ");
                    num+=2;
                }
                num--;
                System.out.println();
            }
        }

    }
