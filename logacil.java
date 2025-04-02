public class logacil {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a&&b&&c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        if (a||b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For Logical Not");
        System.out.println("Not(A) is ");
        System.out.println(!a);
        System.out.println("Not(B) is ");
        System.out.println(!b);;

    }
    
}
