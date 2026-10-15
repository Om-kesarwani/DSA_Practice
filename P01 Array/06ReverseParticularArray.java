public class reveraeparticulararray {
    public static void main(String[] args) {
        // we reversr particular arrys index 
        //example {1,32,21,31,14,6,3,17} revere i=3 to i=5 output is {1,32,21,6,14,31,3,17}
        int[] arr={1,32,21,31,14,6,3,17};
        int sindex=3;
        int lindex=5;
        int i=sindex;
        int j=lindex;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
