public class question02 {
    public static void main(String[] args) {
        System.out.println("Question 01");

        String name = "Yash Thakur";
        name = name.toLowerCase();
        System.out.println(name);

        System.out.println("Question 02");

        String text = "the yash is the good";
        text = text.replace(" ","_");
        System.out.println(text);

        System.out.println("Question 03");

        String letter ="Dear name, THanks a lot!";
        letter = letter.replace("name","yash");
        System.out.println(letter);

        System.out.println("Question 04");

        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        System.out.println("Question 05");

        String letter2 = "Dear yash\n\t thank for learning";
        System.out.println(letter2);
    }
    
}
