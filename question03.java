import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        System.out.println("Question 01");
        int a = 11;
        if (a==11){
            System.out.println("Equal");
        }

        System.out.println("Question 02");
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall Percentage is:" + avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You have been passed");
        }
        else {
            System.out.println("You have been not passed");
        }

        System.out.println("Question 03");
        System.out.println("Enter the income of your: ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income<=2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (income>5f && income<=10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10f ){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);

        System.out.println("Question 04");
        System.out.println("Enter the number of the day: ");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong day");
        }

        System.out.println("Question 05");
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


        System.out.println("Question 06");
        System.out.println("Enter your website : ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("THis is an Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
    
}
