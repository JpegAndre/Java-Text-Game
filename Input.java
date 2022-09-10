import java.util.Scanner;
public class Input {

    public static void main(String[] args) {

        int day = 0;
        Scanner scanner = new Scanner(System.in);


        while (day != -1) {
            try {
                System.out.println("Enter a number\n");
                day = scanner.nextInt();
                          
            }  catch (Exception e) {
                System.out.println("That is not a valid integer");
                break;               
            }

            switch (day) {
                case 0:
                    System.out.println("Today is Monday\n");
                    break;
                case 1:
                    System.out.println("Today is Tuesday\n");
                    break;
                case 2:
                    System.out.println("Today is Wednesday\n");
                    break;
                case 3:
                    System.out.println("Today is Thursday\n");
                    break;
                case 4:
                    System.out.println("Today is Friday\n");
                    break;
                case 5:
                    System.out.println("Today is Saturday\n");
                    break;
                case 6:
                    System.out.println("Today is Sunday\n");
                    break;
                default:
                    System.out.println("Invalid\n");
                    break;
            }


        }
            scanner.close();

        char ch = 'a';

        while (ch != 'z') {
            
            try {
                System.out.println("Enter a word\n");
                day = scanner.next().charAt(2);
                
                switch (ch) {
                    case 'a':
                        System.out.println("");
                        break;
                
                    default:
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("That is not a valid word");
                break;
            }

        }
            scanner.close();
        
    }

    public static void firstChoice(){

    }

    public static void secondChoice(){


    }

    public static void thirdChoice(){
        
    }
    


    
}
