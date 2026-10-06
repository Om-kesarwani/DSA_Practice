import java.util.Scanner ;
public class basic { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("arrays delection");
        int[] arr={1,345,3,5,23,56653,3,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] a=new  int[n];
        System.out.println("default value of arry is 0");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("out put of arrys is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
