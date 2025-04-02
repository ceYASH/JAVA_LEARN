import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are expeienced");
        }
        else if(age>46){
            System.out.println("You are semi_experienced");
        }
        else {
            System.out.println("You ar not experienced");
        }
    }
    
}
