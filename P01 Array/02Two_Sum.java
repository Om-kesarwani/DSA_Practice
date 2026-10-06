public class twoSum {
    public static void main(String[] args) {
        //we have to sum any pair of two element is equal to the target value
        int[] arr={1,2,4,6,24,65,23};
        int target=69;
        int a=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pair is exist");
                    a=1;
                    break;
                }
            }
        }
       if(a==0) System.out.println("no pair is exist in the arry");
    }
}
