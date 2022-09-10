import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        String day = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to go left, right or straight?\n");
        day = scanner.nextln();


        switch(day.toLowerCase()) {
            case 'left':
                left();
                break;
            case 'right':
                right();
                break;
            case 'straight':
                straight();
                break;
            default:
                System.out.println("Those are not one of the options");
                break;
        }

        scanner.close();
        
    }

    public static void left(){
        System.out.println("You go left, would you like to open the door?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'yes':
                leftDoor();
                break;
            case 'no':
                System.out.println("You end your adventure here\n");
                break;
        }

        scanner.close();
    }

    public static void right(){
        System.out.println("You go right, would you like to go into the forest?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'yes':
                rightForest();
                break;
            case 'no':
                System.out.println("You end your adventure here\n");
                break;
        }

        scanner.close();
    }

    public static void straight(){
        System.out.println("You go straight, would you like to jump or fly over the ditch?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'fly':
                straight();
                break;
            case 'jump':
                System.out.println("You fall and you end your adventure here\n");
                break;
        }

        scanner.close();
    }

    public static void leftDoor(){
        System.out.println("You opened the door, would you like to go in?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'yes':
                System.out.println("You went inside and you saw a light");
                break;
            case 'no':
                System.out.println("You end your adventure here\n");
                break;
        }

        scanner.close();
    }

    public static void rightForest(){
        System.out.println("You went into the forest, do you want to explore or go back?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'explore':
                System.out.println("You went into the forest");
                break;
            case 'go back':
                System.out.println("You end your adventure here\n");
                break;
        }

        scanner.close();
    }

    public static void straightDitch(){
        System.out.println("You fly over the ditch, do you continue or go back?");
        day = scanner.nextln();

        switch (day.toLowerCase()) {
            case 'continue':
                System.out.println("You went inside and you saw a light");
                break;
            case 'go back':
                System.out.println("You end your adventure here\n");
        }

        scanner.close();
    }


    
}
