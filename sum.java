import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        System.out.println("Talking Input for the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int a = sc.nextInt();
        System.out.println("Enter number two");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        System.out.println("Enter the 3 number");
        boolean c = sc.hasNextInt();
        System.out.println(c);
        System.out.println("Write your name");
        String str = sc.nextLine();
        System.out.println(str);
    }
    
}
