
package maraton;

import java.util.Scanner;


public class PeriodicStrings {
    
    public static void main(String[] args) {
        int n = 0;
        Scanner sca = new Scanner(System.in);
        
         n = sca.nextInt();
        sca.nextLine();
        int exit = 0;
        for (int i = 0; i < n; i++) {

            String text = sca.nextLine();
            char letter = text.charAt(0);
            for (int j = 1; j < text.length(); j++) {
                if(letter == text.charAt(j)){
                     exit = j;
                    break;
                }
            }
            System.out.println(exit);
        }
    }
    
}
