import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String name = new String("yash");
        String name1 = "thakur";
        System.out.println(name);
        System.out.println(name1);

        System.out.print("The name is:  ");

        int a = 4;
        float b = 6.77f;
        System.out.printf("The value of a is %d and the value of b is %8.2f", a, b);


        System.out.format("The value of a is %d and the value of b is %f", a, b);

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);

        System.out.println("Enter the sentence:");
        String stt = sc.nextLine();
        System.out.println(stt);
    }
    
}
