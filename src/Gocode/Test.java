package Gocode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        long n = 1;
//        for (int i = 1; i < 30; i++) {
//            n = n*2;
//        }
//        System.out.println(n);

//        int x = 5;
//         int  y = ++x;
//        System.out.println(x);
//        System.out.println(y);
//
//        Scanner sc = new Scanner(System.in);



                // Write your code here
//                Scanner sc = new Scanner(System.in);
//                int x = sc.nextInt();
//
//                for(int i = 1 ; i<= x ; i++){
//                    int a = 3 * i + 2;
//                    if((a%4) != 0)
//                        System.out.println(a);
//                }


        Scanner sc = new Scanner (System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        int F;
        for (int i = S; i <= E;  i = i+W) {
            F = (i*5/9) + 32;
            System.out.println(i + " "+F);
        }
    }
        }