import java.util.Scanner;

  public class Nechetko {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число");
        int limit = scanner.nextInt();
        scanner.close();
        if (limit<0) {
            System.out.println("ВВедено отрицательное число");
            return;//
        }
        System.out.println("Последовательность чисел от 0 до "+limit+":");
for (int i = 0; i<=limit; i++) {
    System.out.println(i);
        }
    }
  }
