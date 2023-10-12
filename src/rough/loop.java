package rough;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // write the logic here !!

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // write your code here !!
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {


                if (i > 1 && i < N && j > 1 && j < N) {

                    System.out.print(" ");
                } else {
                    if (j == 1)
                        System.out.print(1);
                    else if (j == N && i > 1 && i < N)
                        System.out.print(2);
                    else
                        System.out.print(j);

                }

            }


            System.out.println();
        }

    }
}

