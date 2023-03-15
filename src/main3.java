import java.util.Scanner;
public class main3{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("хочете погодитись чи відмовитись?");
    String userInput = scanner.nextLine().toLowerCase();
    switch (userInput) {
        case "так":
        case "ок":
            case "yes":
        case "y":
            case "+":
        case "ok":
            System.out.println("погоджуюсь!");
            break;
            case "ні":
        case "no":
            case "n":
        case "-":
            System.out.println("відмовляюсь!");
            break;            default:
            System.out.println("Невідомо!");
            break;
    }    }
}