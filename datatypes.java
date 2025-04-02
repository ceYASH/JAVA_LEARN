public class datatypes {
    public static void main(String[] args){
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b =6.54f + x;
        System.out.println(b);

        System.out.println("Increment Operators");
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println("Decrement Operators");
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);

        System.out.println("Quick Quiz");
        int m = 7;
        int n = ++m *8;
        System.out.println(n);

        char r ='a';
        System.out.println(++r);
    }
    
}
