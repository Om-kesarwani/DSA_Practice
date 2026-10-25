public class passbyvalue {
    public static int change(int a){
        a=99;
        System.out.println("during runimg of change function "+a); 
        return a;
    }
    public static void main(String[] args) {
        int a=12;
        System.out.println("in the main function "+a);
        change(a);  // no change in a
        System.out.println("after calling change function "+a);
    }
}
