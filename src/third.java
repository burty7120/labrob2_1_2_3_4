import java.util.Scanner;

public class third {
    public static void main(String[] args) {



        int currentFloor = 1;
        while (true) {

            System.out.println("Введіть поверх");
            Scanner scanner = new Scanner(System.in);
            int floor = scanner.nextInt();

            if (floor == 1) {
                if (currentFloor == floor) {
                    System.out.println( floor);
                } else {
                    currentFloor = 1;
                    System.out.println("До низу " + floor);
                }
            } else if (floor == 2) {
                if (currentFloor > 2) {
                    currentFloor = 1;
                    System.out.println("До низу " + (floor - 1));
                } else {
                    currentFloor = 3;
                    System.out.println("До верху " + (floor + 1));
                }
            } else if (floor == 3) {
                currentFloor = setFloor(currentFloor, floor);
            } else if (floor == 4) {
                currentFloor = setFloor(currentFloor, floor);
            } else if (floor == 5) {
                currentFloor = setFloor(currentFloor, floor);
            } else if (floor == 6) {
                currentFloor = setFloor(currentFloor, floor);
            }
            else if (floor == 7) {
                currentFloor = setFloor(currentFloor, floor);
            } else if (floor == 8) {
                currentFloor = setFloor(currentFloor, floor);
            }


        }





}

public static int setFloor(int currentFloor, int floor) {
    if (currentFloor == floor) {
        System.out.println( floor);
        return currentFloor;
    } else if (currentFloor > floor) {
        System.out.println("До низу " + floor);
    } else {
        System.out.println("До верху " + floor);
    }
    return floor;
}

}

