
package maraton;

import java.util.Scanner;



public class TheOuroBoros {
    
     public static void main(String[] args) {
        
        int n = 0;
        Scanner sca = new Scanner(System.in);
        
         n = sca.nextInt();
        double number = 0;
        for (int i = 0; i < n; i++) {
                int m = sca.nextInt();
                int base = sca.nextInt();
                for (int j = 0; j < 10; j++) {
                    int factorial = factorial(base);
                    int factorial2 = m-base;
                    factorial2 = factorial(factorial2);
                    number = factorial/factorial2;
                    System.out.println(number);
                    
                }
            }

        }
        
        public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    
}
}
