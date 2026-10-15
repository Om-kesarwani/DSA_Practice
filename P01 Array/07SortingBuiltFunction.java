import java.util.Arrays;
public class SortingArrayBuiltin {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={12,43,1,5,-2,-56,97,2,4,5,1};
        System.out.println("arrays before sorting");
        print(arr);
        Arrays.sort(arr);       // it disply the incresing order
        System.out.println("arrays after soting by build in function");
        print(arr);
    }
}
