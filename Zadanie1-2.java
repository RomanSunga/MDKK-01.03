import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут");

        String name = scanner.nextLine();
        System.out.println("Привет" + name + "!");
        System.out.println("Откуда ты?");
        String country = scanner.nextLine();
        if (Objects.equals(country, "Россия")){
            System.out.println("Значит наш");
        }
        else{
            System.out.println("Депортировать");
        }
        System.out.println("Это калькулятор, введите число");
        double num1 = scanner.nextDouble();
        System.out.println("Действие: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Второе число:");
        double num2 = scanner.nextDouble();

        double result;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        if (validOperation){
            System.out.println(result);
        }
    }

}
