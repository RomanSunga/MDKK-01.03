import java.util.Objects;
import java.util.Scanner;

public class chetko {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("ВВедите число");
        int n = scanner.nextInt();
        scanner.close();
        if ((n%2)==0){
            System.out.println("Число " +n+ " Четное");
        }
        else {
            if ((n%1)==0){
                System.out.println("Число " +n+ " Нечетное");
            }
        }
    }

}
