import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть тризначне число: ");
        int n = scanner.nextInt();

        System.out.println("Найбільше число: " + n);
    }
}