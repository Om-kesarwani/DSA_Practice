public class returntype {
    public static void max(int a,int b,int c) { // no return type need
        if(a>b && a>c) System.out.println(a);
        else if(b>a &&b>c) System.out.println(b);
        else System.out.println(c);
    }
    public static int min(int a,int b,int c){// need return
        if(a<b && a<c) return a;
        else if(b<a && b<c) return b;
        else return c;
       

    }
    public static int sum(int a,int b){  // int is the return type parameter return type need
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(8,6));  // argument
        max(2,654567,967);
       System.out.println( min(2,765,678));
    }
}
