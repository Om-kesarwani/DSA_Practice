import java.util.Arrays;
public class shalloanddeepcopy {
    public static void main(String[] args) {
        int[] arr={1,23,45,67,32,46,32};
        // int[] x=arr;    // we changing the value of x but arr value is also change
        // x[3]=99;        // shaloo copy of arry one change reflect to other
        // System.out.println(arr[3]);

        // int[] deep=Arrays.copyOf(arr,arr.length);  // deep copy of arry no change reflect in main arry
        // System.out.println(deep[2]);
        // deep[2]=88;
        // System.out.println(deep[2]);
        // System.out.println(arr[2]);   // no change in arr on chaning the deep arrays


        // other way creating deep copy of array
        int[] brr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];               // deep copy no change is reflect to other arry
        }

    }
}
