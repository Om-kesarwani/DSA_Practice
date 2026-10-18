public class TwoPointer {
    public static void main(String[] args) {
        //by using two pointer we reverse the arryas
        int[] arr={12,43,424,24,6,32,6,1,78};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("reverse of arryas ");
        for(int o : arr){
            System.out.print(o+" ");
        }
    }
}
