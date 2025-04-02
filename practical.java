import java.util.Scanner;

public class practical {
    public static void main(String[] args) {
        System.out.println("Question 01");
        float a = (7/4.0f) * (9/2.0f);
        System.out.println(a);

        System.out.println("Question 02");
        char grade = 'B';
        grade =(char) (grade + 8);
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println("Question 03");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);

        System.out.println("Question 04");
        int m = 9;
        int n = 8;
        int o = 6;
        int p = 5;
        int q = (m*m - n*n) / 2 *o *p;
        System.out.println(q);

        System.out.println("Question 05");
        int x = 7;
        int y = (x*49/x) + 35/x;
        System.out.println(y);
    }
    
}
