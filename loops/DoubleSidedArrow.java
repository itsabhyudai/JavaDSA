package loops;
import java.util.Scanner;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //int rows = n;
        int mid = (n + 1) / 2;
        int outerSpaces = mid - 1;
        int innerSpaces = -1;

        for (int i = 1; i <= n; i++) {

            
            for (int j = 1; j <= outerSpaces; j++) {
                System.out.print("\t");
            }

            
            int val = i <= mid ? i : n - i + 1;
            for (int j = val; j >= 1; j--) {
                System.out.print(j + "\t");
            }

            
            if (innerSpaces >= 0) {
                for (int j = 1; j <= innerSpaces; j++) {
                    System.out.print("\t");
                }

                
                for (int j = 1; j <= val; j++) {
                    System.out.print(j + "\t");
                }
            }

            
            System.out.println();

            
            if (i < mid) {
                outerSpaces -= 1;
                innerSpaces += 2;
            } else {
                outerSpaces += 1;
                innerSpaces -= 2;
            }
        }
        sc.close();
    }
}
