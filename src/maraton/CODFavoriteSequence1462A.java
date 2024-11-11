
package maraton;


import java.util.Scanner;


public class CODFavoriteSequence1462A {
    
    public static void main(String[] args) {
        
        int n = 0, a = 0,counter,counter2;
        Scanner sca = new Scanner(System.in);
         n = sca.nextInt();
        sca.nextLine();
        for (int i = 0; i < n; i++) {
            a = sca.nextInt();
            sca.nextLine();
            int numbers [] = new int[a];
            int exit[] = new int [a];
            counter = 0;
            counter2=0;
            for (int j = 0; j < a; j++) {
                numbers[j] = sca.nextInt();
            }
            for (int j = 0; j < a; j++) {
                if(j%2 == 0){
                    exit[j] = numbers[counter2];
                    counter2++;
                }
                else{
                    counter++;
                    exit[j] = numbers[a-counter];
                }
            }
            
            for (int j = 0; j < a; j++) {
                System.out.println(exit[j]);
            }
        }
    }
}
