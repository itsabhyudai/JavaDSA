package basics;
import java.util.*;

public class HelloName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name );

        sc.close();
    }
}
