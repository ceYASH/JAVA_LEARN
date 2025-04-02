import java.util.Scanner;

public class switchif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("Your are 18");
                break;
            case 20:
                System.out.println("Your are 20");
                break;
            case 25:
                System.out.println("Your are 25");
                break;
            case 30:
                System.out.println("Your are 30");
                break;
            case 31:
                System.out.println("Your are 31");
                break;
            default:
                System.out.println("enjoy");
        }
        String name = "Yash";

        switch (name){
            case "Yash" -> System.out.println("your name is yash");
            case "haresh" -> System.out.println("your name is haresh");
        }
    }
    
}
