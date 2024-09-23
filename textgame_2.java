import java.util.Scanner;

public class textgame_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean b = false;

        while (b == false) {
            System.out.println("Would you like to go left, right or straight?\n");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "left":
                    boolean b = false;
                    while (b == false) {
                        System.out.println("You go left, would you like to open the door?\n");
                        String choice1 = scanner.nextLine();

                        switch (choice1.toLowerCase()) {
                            case "yes":
                                boolean b = false;
                                while (b == false) {
                                    System.out.println("You opened the door, would you like to go in?\n");
                                    String choice2 = scanner.nextLine();

                                    switch (choice2.toLowerCase()) {
                                        case "yes":
                                            System.out.println("You went inside and you saw a light\n");
                                            b = true;
                                            break;
                                        case "no":
                                            System.out.println("You decide to turn back and end your adventure here\n");
                                            b = true;
                                            break;
                                        default:
                                            System.out.println("That is not a valid choice, try again!");
                                            b = false;
                                            break;
                                    }
                                }
                                b = true;
                                break;
                            case "no":
                                System.out.println("You don't open the door and are forced to go back\n");
                                b = true;
                                break;
                            default:
                                System.out.println("That is not a valid choice, try again!");
                                b = false;
                                break;
                        } 
                    }
                    b = true;
                    break;  
                case "right":
                    boolean b = false

                    while(b == false) {
                        System.out.println("You go right, would you like to go into the forest?\n");
                        String choice1 = scanner.nextLine();

                        switch (choice1.toLowerCase()) {
                            case "yes":
                                boolean b = false;
                                while (b == false) {
                                    System.out.println("You went into the forest, do you want to explore or go back?\n");
                                    String choice2 = scanner.nextLine();

                                    switch (choice2.toLowerCase()) {
                                        case "explore":
                                            System.out.println("You went into the forest\n");
                                            b = true;
                                            break;
                                        case "go back":
                                            System.out.println("You decide to go back and end your adventure here\n");
                                        default:
                                            System.out.println("That is not a valid choice, try again!");
                                            b = false;
                                            break;
                                    }
                                }
                                b = true;
                                break;
                            case "no":
                                System.out.println("You don't enter the forest and your adventure ends here");
                                b = true;
                            default:
                                System.out.println("That is not a valid choice, try again!")
                                b = false;
                                break;     
                        }
                    }
                    b = true;
                    break;
                case "straight":
                    boolean b = false;

                    while (b == false) {
                        System.out.println("You go straight and see a ditch, would you like to jump or fly over the ditch>\n");
                        String choice1 = scanner.nextLine();

                        switch (choice1.toLowerCase()) {
                            case "fly":
                                boolean b = false;

                                while (b == false) {
                                    System.out.println("You fly over the dtich, do you contiue of go back?\n");
                                    String choice2 = scanner.nextLine();

                                    switch (choice2.toLowerCase()) {
                                        case "continue":
                                            System.out.println("You continue and you find a magical unicorn\n");
                                            b = true;
                                            break;
                                        case "go back":
                                            System.out.println("You decide to go back and end your adventure here\n");
                                            b = true;
                                            break;
                                        default:
                                            System.out.println("That is not a valid choice, try again!");
                                            b = false;
                                            break;
                                    }
                                }
                                b = true;
                                break;
                            case "jump":
                                System.out.println("You could not make the jump and you fall, you end your adventure here\n");
                                b = true;
                                break;
                            default:
                                System.out.println("That is not a valid choice, try again!");
                                b = false;
                                break;

                        }
                    }
                    b = true;
                    break;
                default:
                    System.out.println("That is not a valid choice, try again!");
                    b = false;
                    break;
            }
        }
        scanner.close();
    }
}