
package maraton;

import java.util.Scanner;


public class Maraton {



    public static void main(String[] args) {
        int n = 0;
        Scanner sca = new Scanner(System.in);
        
         n = sca.nextInt();
        sca.nextLine();
        
        for (int i = 0; i < n; i++) {
            int number1 = sca.nextInt();
            int number2 = sca.nextInt();
           
            if( number1 > number2){
                System.out.println(">");
            }
            else if( number1 < number2){
                System.out.println("<");
            }
            else {
                System.out.println("=");
            }
        }
    }
    
}




    /*Some operators checks about the relationship between two values and these operators are called relational operators. Given two numerical values your job is just to find out the relationship between them
that is (i) First one is greater than the second (ii) First one is less than the second or (iii) First and
second one is equal.
*/