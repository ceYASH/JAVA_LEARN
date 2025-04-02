public class stringmethod {
    public static void main(String[] args) {
        String name = "yash thakur";
        String a1 = new String("YASH");
        System.out.println(name);
        System.out.println(a1);

        int value = name.length();
        System.out.println(value);

        String lstring = a1.toLowerCase();
        System.out.println(lstring);

        String uptring = name.toUpperCase();
        System.out.println(uptring);

        String nonTrimmedString = "      Yash       ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(5,10));

        System.out.println(name.replace('a','i'));
        System.out.println(name.replace("thakur","patil"));

        System.out.println(name.startsWith("ya"));
        System.out.println(name.startsWith("th"));
        System.out.println(name.endsWith("kur"));
        System.out.println(name.endsWith("th"));

        System.out.println(name.charAt(1));

        String moo = "Yashsh";
        System.out.println(name.indexOf("tha"));
        System.out.println(moo.indexOf("sh", 3));
        System.out.println(moo.lastIndexOf("sh",3));

        System.out.println(name.equals("yash thakur"));
        System.out.println(name.equalsIgnoreCase("Yash Thakur"));

        System.out.println("I am escape Seqence\" double quote ");
        System.out.println("I am escape Seqence\\ double quote ");
        System.out.println("I am escape Seqence\' double quote ");
        System.out.println("I am escape Seqence\f double quote ");
        System.out.println("I am escape Seqence\r double quote ");
        System.out.println("I am escape Seqence\n double quote ");
        System.out.println("I am escape Seqence\b double quote ");
        System.out.println("I am escape Seqence\t double quote ");


    }
    
}
