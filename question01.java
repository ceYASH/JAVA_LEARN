import java.util.Scanner;

public class question01 {
    public static void main(String[] args){
        System.out.println("Question no 1");
        int a = 4;
        int b = 8;
        int c = 9;
        int sum = a+b+c;
        System.out.println(sum);

        System.out.println("Question no 2");
         float suj1 = 50;
         float suj2 = 24;
         float suj3 = 75;
         float cgpa = (suj1+suj2+suj3)/30;
        System.out.println(cgpa);

        System.out.println("Question no 3");
        System.out.println("What is your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+ name + " have a good day!");

        System.out.println("Question no 4");
        System.out.println("Enter the KM to Miles");
        float km = sc.nextFloat();
        double mm = km*0.62137119;
        System.out.println("The KM to mile is "+ mm);

        System.out.println("Question no 5");
        System.out.println(sc.hasNextInt());

    }
    
}
