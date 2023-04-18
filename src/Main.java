public class Main {

    public static void main(String[] args) {

        System.out.println(addition(4,5));
        System.out.println(addDisplay(addition(5,6)));

    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static String addDisplay(int c){
        return ("Die Summe beträgt: " + c);
    }
}
